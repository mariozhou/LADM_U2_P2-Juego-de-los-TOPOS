package mx.tecnm.tepic.ladm_u2_juegodetopo

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View
import androidx.core.view.isInvisible
import kotlin.random.Random

class Lienzo(p:MainActivity) : View(p) {
    var estado = true
    var estado2 = false
    var estado3 = true
    var nivel = 1
    var golpe = 1
    var escapar = 1
    var pantalla = 1
    var boton1 = Imagen(this, R.drawable.biniciar, 100f, 100f)
    var next = Imagen(this, R.drawable.next, 100f, 100f)
    var fondo1 = Imagen(this, R.drawable.fondo2, 0f, -350f)
    var gamerover = Imagen(this, R.drawable.gameover, 50f, 400f)
    var boton2 = Imagen(this, R.drawable.biniciar, 100f, 900f)
    var congra = Imagen(this, R.drawable.congra, 50f, 100f)
    var winner = Imagen(this, R.drawable.win2, 10f, 500f)
    var topo = Topo(this)
    var coco  = Topo(this)
    var coco1 = Topo(this)
    var coco2 = Topo(this)
    var coco3 = Topo(this)
    var coco4 = Topo(this)
    var coco5 = Topo(this)
    var coco6 = Topo(this)
    var coco7 = Topo(this)
    var coco8 = Topo(this)
    var coco9 = Topo(this)
    var coco10  = Topo(this)
    var coco11  = Topo(this)
    var coco12  = Topo(this)
    var coco13  = Topo(this)
    var coco14  = Topo(this)
    var coco15  = Topo(this)
    var coco16  = Topo(this)
    var coco17  = Topo(this)
    var coco18  = Topo(this)
    var cocox  = Topo(this)
    var cocox1 = Topo(this)
    var cocox2 = Topo(this)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        var vel = 0L
        when (pantalla) {
            1 -> {
                golpe=0
                escapar=0
                estado = true
                estado2 = false
                invalidate()
                p.color = Color.DKGRAY
                fondo1.pintar(c)
                p.textSize = 130f
                c.drawText("JUEGO DE TOPO", 75f, 850f, p)
                p.color = Color.LTGRAY
                p.textSize = 80f
                c.drawText("JIACHENG ZHOU", 210f, 1000f, p)
                boton1.pintar(c)
            }

            2 -> {
                vel = 3261L
                nivel = 1
                c.drawColor(Color.BLUE)
                p.color = Color.WHITE
                p.textSize =110f
                c.drawText("Nivel ${nivel}", 400f, 130f, p)
                p.color = Color.RED
                p.textSize = 63f
                c.drawText("Golpear 3 Topos", 40f, 210f, p)
                c.drawText("Topo escapado ${escapar}", 560f, 210f, p)
                // p.color=Color.BLACK  //a18262   4b3621
                p.setColor(Color.parseColor("#a18262"))
                c.drawCircle(500f,1350f,850f,p)

                if (estado){
                    val hilo = Thread(Runnable {
                        golpe = 0
                        escapar = 0

                        topo.dibujar =false
                        topo.invisible = false
                        topo.estado = true
                            Thread.sleep(500)
                            estado = false
                            estado2 = true
                         //   topo.velocidad = 2500
                    }).start()
                }

                if(estado2){
                    cocox.pintar(c,vel)
                    coco.pintar(c,vel)
                    coco1.pintar(c,vel)
                    coco2.pintar(c,vel)
                    coco3.pintar(c,vel)
                }

                if(escapar>=3 && estado3){
                    pantalla=10
                }
                if(golpe >=3 ){

                    estado = true
                    estado2 = false
                    pantalla = 3
                }
                invalidate()
            }//2

            3 ->{
                vel = 2500L
                nivel = 2
                c.drawColor(Color.BLUE)
                p.color = Color.WHITE
                p.textSize =110f
                c.drawText("Nivel ${nivel}", 400f, 130f, p)
                p.color = Color.RED
                p.textSize = 63f
                c.drawText("Golpear 4 Topos", 40f, 210f, p)
                c.drawText("Topo escapado ${escapar}", 560f, 210f, p)
                // p.color=Color.BLACK  //a18262   4b3621
                p.setColor(Color.parseColor("#a18262"))
                c.drawCircle(500f,1350f,850f,p)

                if (estado){
                    val hilo = Thread(Runnable {
                        golpe = 0
                        escapar = 0
                        Thread.sleep(2000)
                        golpe = 0
                        escapar = 0
                        estado = false
                        estado2 = true
                    }).start()
                }

                if(estado2){
                    coco4.pintar(c,vel)
                    coco5.pintar(c,vel)
                    coco6.pintar(c,vel)
                    coco7.pintar(c,vel)
                    coco8.pintar(c,vel)
                    coco9.pintar(c,vel)
                    coco10.pintar(c,vel)
                    coco11.pintar(c,vel)
                }
                invalidate()

                if(escapar>=3 && estado3){
                    pantalla=10
                }
                if(golpe >=4 ){
                    estado = true
                    estado2 = false
                    pantalla=4
                }
            }//3

            4 ->{
                vel = 2100L
                nivel = 3
                c.drawColor(Color.BLUE)
                p.color = Color.WHITE
                p.textSize =110f
                c.drawText("Nivel ${nivel}", 400f, 130f, p)
                p.color = Color.RED
                p.textSize = 63f
                c.drawText("Golpear 6 Topos", 40f, 210f, p)
                c.drawText("Topo escapado ${escapar}", 560f, 210f, p)
                // p.color=Color.BLACK  //a18262   4b3621
                p.setColor(Color.parseColor("#a18262"))
                c.drawCircle(500f,1350f,850f,p)

                if (estado){
                    val hilo = Thread(Runnable {
                        golpe = 0
                        escapar = 0
                        Thread.sleep(2000)
                        golpe = 0
                        escapar = 0
                        estado = false
                        estado2 = true
                    }).start()
                }

                if(estado2){
                    cocox1.pintar(c,vel)
                    cocox2.pintar(c,vel)
                    coco12.pintar(c,vel)
                    coco13.pintar(c,vel)
                    coco14.pintar(c,vel)
                    coco15.pintar(c,vel)
                    coco16.pintar(c,vel)
                    coco17.pintar(c,vel)
                    coco18.pintar(c,vel)
                }
                invalidate()

                if(escapar>=3 && estado3){
                    pantalla=10
                }
                if(golpe >=6 ){
                    pantalla=11}
            }//4


            10->{
                invalidate()
             //   p.setColor(Color.parseColor("#a18262"))
                c.drawColor(Color.parseColor("#a18262"))
                gamerover.pintar(c)
                //boton2.pintar(c)
                estado = true
                estado2 = false
                topo.t = 1
                topo.dibujar =false
                topo.invisible = false
                topo.estado = true
            }

            11->{
                invalidate()
                //   p.setColor(Color.parseColor("#a18262"))
                c.drawColor(Color.parseColor("#a18262"))
                congra.pintar(c)
                winner.pintar(c)
                estado = true
                estado2 = false
                topo.t = 1
                topo.dibujar =false
                topo.invisible = false
                topo.estado = true
            }
        }
    }//ondraw


    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {



                MotionEvent.ACTION_DOWN -> {

                if(pantalla==1 && boton1.estaEnArea(event.x,event.y)){
                    pantalla = 2
                }
                if((pantalla==10 || pantalla==11) && boton2.estaEnArea(event.x,event.y)){
                    //  pantalla = 1
                }
                if (coco.estaEnArea(event.x, event.y) && !coco.invisible && pantalla==2) {
                    coco.t = 2
                }
                if (coco1.estaEnArea(event.x, event.y) && !coco1.invisible && pantalla==2) {
                    coco1.t = 2
                }
                if (coco2.estaEnArea(event.x, event.y) && !coco2.invisible && pantalla==2) {
                    coco2.t = 2
                }
                if (coco3.estaEnArea(event.x, event.y) && !coco3.invisible && pantalla==2) {
                    coco3.t = 2
                }
                if (cocox.estaEnArea(event.x, event.y) && !cocox.invisible && pantalla==2) {
                    cocox.t = 2
                }

                if (coco4.estaEnArea(event.x, event.y) && !coco4.invisible && pantalla==3) {
                    coco4.t = 2
                }
                if (coco5.estaEnArea(event.x, event.y) && !coco5.invisible && pantalla==3) {
                    coco5.t = 2
                }
                if (coco6.estaEnArea(event.x, event.y) && !coco6.invisible && pantalla==3) {
                    coco6.t = 2
                }
                if (coco7.estaEnArea(event.x, event.y) && !coco7.invisible && pantalla==3) {
                    coco7.t = 2
                }
                if (coco8.estaEnArea(event.x, event.y) && !coco8.invisible && pantalla==3) {
                    coco8.t = 2
                }
                if (coco9.estaEnArea(event.x, event.y) && !coco9.invisible && pantalla==3) {
                    coco9.t = 2
                }
                if (coco10.estaEnArea(event.x, event.y) && !coco10.invisible && pantalla==3) {
                    coco10.t = 2
                }
                if (coco11.estaEnArea(event.x, event.y) && !coco11.invisible && pantalla==3) {
                    coco11.t = 2
                }

                if (coco12.estaEnArea(event.x, event.y) && !coco12.invisible && pantalla==4) {
                    coco12.t = 2
                }
                if (coco13.estaEnArea(event.x, event.y) && !coco13.invisible && pantalla==4) {
                    coco13.t = 2
                }
                if (coco14.estaEnArea(event.x, event.y) && !coco14.invisible && pantalla==4) {
                    coco14.t = 2
                }
                if (coco15.estaEnArea(event.x, event.y) && !coco15.invisible && pantalla==4) {
                    coco15.t = 2
                }
                if (coco16.estaEnArea(event.x, event.y) && !coco16.invisible && pantalla==4) {
                    coco16.t = 2
                }
                if (coco17.estaEnArea(event.x, event.y) && !coco17.invisible && pantalla==4) {
                    coco17.t = 2
                }
                if (coco18.estaEnArea(event.x, event.y) && !coco18.invisible && pantalla==4) {
                    coco18.t = 2
                }
                if (cocox1.estaEnArea(event.x, event.y) && !cocox1.invisible && pantalla==4) {
                    cocox1.t = 2
                }
                if (cocox2.estaEnArea(event.x, event.y) && !cocox2.invisible && pantalla==4) {
                    cocox2.t = 2
                }
            }
        }
        return true
    }//ontouch

}


