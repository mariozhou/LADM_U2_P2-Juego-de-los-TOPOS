package mx.tecnm.tepic.ladm_u2_juegodetopo

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import kotlin.random.Random
import kotlin.system.measureTimeMillis

class Topo(l:Lienzo) {
    var i = (1..20).random()
    var estado = true
    var act = l
    var ms = List(20){ Random.nextInt(850,2650).toLong()}
    var t = 1
    var xs = 1
    var dibujar = false
    var contador = 0
    var x = List(30){ Random.nextInt(80,900).toFloat()}
    var y = List(30){ Random.nextInt(400,1700).toFloat()} //1780
    var itopo = BitmapFactory.decodeResource(l.resources, R.drawable.topo)
    var itopomuerto = BitmapFactory.decodeResource(l.resources, R.drawable.topomuerto)
    var btnini = BitmapFactory.decodeResource(l.resources, R.drawable.biniciar)
    var invisible = false

    fun pintar(c: Canvas,vel:Long) {
        if(estado){
            val hilo = Thread(Runnable {
                Thread.sleep(ms[15])
                dibujar = true
            }).start()
            estado = false
        }//tiempo aparece
if(dibujar) {
    if (t == 1) {
        if (invisible) return
        c.drawBitmap(itopo, x[i], y[i], Paint())
        val hilo = Thread(Runnable {
            Thread.sleep(vel)//tiempo que los topo desaparece
            if (t == 1) {
                act.escapar++
                t = 3
                dibujar = false
            }
        }).start()

    }//dibijar

    if (t == 2) {
        if (invisible) return
        c.drawBitmap(itopomuerto, x[i], y[i], Paint())
        val hilo = Thread(Runnable {
            if (xs == 1) {
                act.golpe++
                xs = 2
            }
            Thread.sleep(100)
            invisible = true
            t = 3
        }).start()
    }
}
    }//pintar

    fun estaEnArea(toqueX: Float, toqueY: Float): Boolean {
        var x2 = x[i] + itopo.width
        var y2 = y[i] + itopo.height

        if (toqueX >= x[i] && toqueX <= x2) {
            if (toqueY >= y[i] && toqueY <= y2) {
                return true
            }
        }
        return false
    }//estaArea

}

class Hilosleep(img:Topo):Thread(){
    var topo = img
    var x= 0
    var iniciado = true
    var pausa= 0

    override fun run() {
        super.run()
        while (iniciado){
            if (pausa==0){
                topo.contador ++
            }
            sleep(500)
           // x = 1
           // this.interrupt()
        }//whil
    }

    fun pausar(){
        pausa = 1
    }

    fun detener(){
        iniciado = false
    }

}
