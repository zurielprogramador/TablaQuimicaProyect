/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class TABLA extends javax.swing.JFrame {

    /**
     * Creates new form TABLA
     */
//    no metales
    int c=1,n=1,o=1,f=1,ne=1,p=1,s=1,ci=1,ar=1,se=1,br=1,kr=1,i=1,xe=1,at=1,rn=1,h=1,he=1;
//    metaloides
    int b=1,si=1,ge=1,as=1,sb=1,te=1,po=1;
//    metales
    int li=1,be=1,na=1,mg=1,k=1,ca=1,rb=1,sr=1,cs=1,ba=1,fr=1,ra=1,sc=1,y=1,ti=1,zr=1,hf=1,rf=1,v=1,nb=1,ta=1,db=1,cr=1,mo=1,w=1,sg=1,mn=1,tc=1,re=1,bh=1,fe=1,ru=1;
    int os=1,hs=1,co=1,rh=1,ir=1,mt=1,ni=1,pd=1,pt=1,ds=1,cu=1,ag=1,au=1,rg=1,zn=1,cd=1,hg=1,da=1,al=1,ga=1,in=1,tl=1,tf=1,sn=1,pb=1,bi=1,eo=1,me=1,nc=1,el=1,on=1;
    int la=1,ce=1,pr=1,nd=1,pm=1,sm=1,eu=1,gd=1,tb=1,dy=1,ho=1,er=1,tm=1,yb=1,lu=1;
    int ac=1,th=1,pa=1,u=1,np=1,pu=1,am=1,cm=1,bk=1,cf=1,es=1,fm=1,md=1,no=1,lr=1;
    
   imagenfondo Imagen = new imagenfondo();
    public TABLA() {
        this.setContentPane(Imagen);
        this.setUndecorated(true);
        
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
//       this.getContentPane().setBackground(Color.DARK_GRAY);
        Limpiar();
        
          carbon.setBackground(Color.GREEN);
          nitrogeno.setBackground(Color.GREEN);
          oxigeno.setBackground(Color.GREEN);
          fluor.setBackground(Color.GREEN);
          helio.setBackground(Color.GREEN);
          neon.setBackground(Color.GREEN);
          argon.setBackground(Color.GREEN);
          kripton.setBackground(Color.GREEN);
          xenon.setBackground(Color.GREEN);
          radon.setBackground(Color.GREEN);
          fosforo.setBackground(Color.GREEN);
          azufre.setBackground(Color.GREEN);
          cloro.setBackground(Color.GREEN);
          selenio.setBackground(Color.GREEN);
          bromo.setBackground(Color.GREEN);
          yodo.setBackground(Color.GREEN);
          astato.setBackground(Color.GREEN);
          hidrogeno.setBackground(Color.GREEN);
          boro.setBackground(Color.RED);
          silicio.setBackground(Color.RED);
          germanio.setBackground(Color.RED);
          antimonio.setBackground(Color.RED);
          telurio.setBackground(Color.RED);
          polonio.setBackground(Color.RED);
          arsenico.setBackground(Color.RED);
          arsenico.setBackground(Color.RED);
          litio.setBackground(Color.YELLOW);
          sodio.setBackground(Color.YELLOW);
          potasio.setBackground(Color.YELLOW);
          rubidio.setBackground(Color.YELLOW);
          cesio.setBackground(Color.YELLOW);
          francio.setBackground(Color.YELLOW);
          berilio.setBackground(Color.YELLOW);
          magnesio.setBackground(Color.YELLOW);
          calcio.setBackground(Color.YELLOW);
          estroncio.setBackground(Color.YELLOW);
          bario.setBackground(Color.YELLOW);
          radio.setBackground(Color.YELLOW);
          escandio.setBackground(Color.YELLOW);
          itrio.setBackground(Color.YELLOW);
          titanio.setBackground(Color.YELLOW);
          zirconio.setBackground(Color.YELLOW);
          hafnio.setBackground(Color.YELLOW);
          ruthterfordio.setBackground(Color.YELLOW);
          vanadio.setBackground(Color.YELLOW);
          niobio.setBackground(Color.YELLOW);
          tantalio.setBackground(Color.YELLOW);
          dubnio.setBackground(Color.YELLOW);
          cromo.setBackground(Color.YELLOW);
          molibdeno.setBackground(Color.YELLOW);
          tungsteno.setBackground(Color.YELLOW);
          seaborgio.setBackground(Color.YELLOW);
          manganeso.setBackground(Color.YELLOW);
          tecnecio.setBackground(Color.YELLOW);
          renio.setBackground(Color.YELLOW);
          bohrio.setBackground(Color.YELLOW);
          hierro.setBackground(Color.YELLOW);
          rutenio.setBackground(Color.YELLOW);
          osmio.setBackground(Color.YELLOW);
          hassio.setBackground(Color.YELLOW);
          cobalto.setBackground(Color.YELLOW);
          rodio.setBackground(Color.YELLOW);
          iridio.setBackground(Color.YELLOW);
          meitnerio.setBackground(Color.YELLOW);
          niquel.setBackground(Color.YELLOW);
          paladio.setBackground(Color.YELLOW);
          platino.setBackground(Color.YELLOW);
          darmstadtio.setBackground(Color.YELLOW);
          cobre.setBackground(Color.YELLOW);
          plata.setBackground(Color.YELLOW);
          oro.setBackground(Color.YELLOW);
          roentgenio.setBackground(Color.YELLOW);
          zinc.setBackground(Color.YELLOW);
          cadmio.setBackground(Color.YELLOW);
          mercurio.setBackground(Color.YELLOW);
          darwanzio.setBackground(Color.YELLOW);
          aluminio.setBackground(Color.YELLOW);
          galio.setBackground(Color.YELLOW);
          indio.setBackground(Color.YELLOW);
          talio.setBackground(Color.YELLOW);
          tustrano.setBackground(Color.YELLOW);
          estaño.setBackground(Color.YELLOW);
          plomo.setBackground(Color.YELLOW);
          erristeneo.setBackground(Color.YELLOW);
          bismuto.setBackground(Color.YELLOW);
          merchel.setBackground(Color.YELLOW);
          nectarten.setBackground(Color.YELLOW);
          efelio.setBackground(Color.YELLOW);
          oberon.setBackground(Color.YELLOW);
          lantano.setBackground(Color.YELLOW);
          cerio.setBackground(Color.YELLOW);
          praseodimio.setBackground(Color.YELLOW);
          neodimio.setBackground(Color.YELLOW);
          prometio.setBackground(Color.YELLOW);
          samario.setBackground(Color.YELLOW);
          europio.setBackground(Color.YELLOW);
          gadolinio.setBackground(Color.YELLOW);
          terbio.setBackground(Color.YELLOW);
          disprosio.setBackground(Color.YELLOW);
          holmio.setBackground(Color.YELLOW);
          erbio.setBackground(Color.YELLOW);
          tulio.setBackground(Color.YELLOW);
          iterbio.setBackground(Color.YELLOW);
          lutecio.setBackground(Color.YELLOW);
          actinio.setBackground(Color.YELLOW);
          torio.setBackground(Color.YELLOW);
          protactinio.setBackground(Color.YELLOW);
          uranio.setBackground(Color.YELLOW);
          neptunio.setBackground(Color.YELLOW);
          plutonio.setBackground(Color.YELLOW);
          americio.setBackground(Color.YELLOW);
          curio.setBackground(Color.YELLOW);
          berkelio.setBackground(Color.YELLOW);
          californio.setBackground(Color.YELLOW);
          einstenio.setBackground(Color.YELLOW);
          fermio.setBackground(Color.YELLOW);
          mendelevio.setBackground(Color.YELLOW);
          nobelio.setBackground(Color.YELLOW);
          lawrencio.setBackground(Color.YELLOW);
//           lantanio.setBackground(Color.YELLOW);
//          actinidos.setBackground(Color.YELLOW);
//       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        grupos = new javax.swing.ButtonGroup();
        cesio = new javax.swing.JButton();
        berilio = new javax.swing.JButton();
        magnesio = new javax.swing.JButton();
        estroncio = new javax.swing.JButton();
        hidrogeno = new javax.swing.JButton();
        calcio = new javax.swing.JButton();
        potasio = new javax.swing.JButton();
        radio = new javax.swing.JButton();
        sodio = new javax.swing.JButton();
        bario = new javax.swing.JButton();
        litio = new javax.swing.JButton();
        rubidio = new javax.swing.JButton();
        francio = new javax.swing.JButton();
        actinidos = new javax.swing.JButton();
        cromo = new javax.swing.JButton();
        vanadio = new javax.swing.JButton();
        tantalio = new javax.swing.JButton();
        zirconio = new javax.swing.JButton();
        niobio = new javax.swing.JButton();
        titanio = new javax.swing.JButton();
        dubnio = new javax.swing.JButton();
        itrio = new javax.swing.JButton();
        ruthterfordio = new javax.swing.JButton();
        escandio = new javax.swing.JButton();
        lantanio = new javax.swing.JButton();
        hafnio = new javax.swing.JButton();
        tungsteno = new javax.swing.JButton();
        hassio = new javax.swing.JButton();
        osmio = new javax.swing.JButton();
        rutenio = new javax.swing.JButton();
        rodio = new javax.swing.JButton();
        hierro = new javax.swing.JButton();
        tecnecio = new javax.swing.JButton();
        bohrio = new javax.swing.JButton();
        manganeso = new javax.swing.JButton();
        seaborgio = new javax.swing.JButton();
        cobalto = new javax.swing.JButton();
        renio = new javax.swing.JButton();
        molibdeno = new javax.swing.JButton();
        iridio = new javax.swing.JButton();
        oro = new javax.swing.JButton();
        cobre = new javax.swing.JButton();
        darmstadtio = new javax.swing.JButton();
        platino = new javax.swing.JButton();
        plata = new javax.swing.JButton();
        paladio = new javax.swing.JButton();
        roentgenio = new javax.swing.JButton();
        niquel = new javax.swing.JButton();
        meitnerio = new javax.swing.JButton();
        yodo = new javax.swing.JButton();
        fosforo = new javax.swing.JButton();
        zinc = new javax.swing.JButton();
        aluminio = new javax.swing.JButton();
        boro = new javax.swing.JButton();
        cadmio = new javax.swing.JButton();
        darwanzio = new javax.swing.JButton();
        nitrogeno = new javax.swing.JButton();
        mercurio = new javax.swing.JButton();
        carbon = new javax.swing.JButton();
        silicio = new javax.swing.JButton();
        indio = new javax.swing.JButton();
        galio = new javax.swing.JButton();
        tustrano = new javax.swing.JButton();
        talio = new javax.swing.JButton();
        erristeneo = new javax.swing.JButton();
        bromo = new javax.swing.JButton();
        selenio = new javax.swing.JButton();
        polonio = new javax.swing.JButton();
        antimonio = new javax.swing.JButton();
        telurio = new javax.swing.JButton();
        arsenico = new javax.swing.JButton();
        nectarten = new javax.swing.JButton();
        estaño = new javax.swing.JButton();
        merchel = new javax.swing.JButton();
        germanio = new javax.swing.JButton();
        plomo = new javax.swing.JButton();
        bismuto = new javax.swing.JButton();
        astato = new javax.swing.JButton();
        oxigeno = new javax.swing.JButton();
        neon = new javax.swing.JButton();
        xenon = new javax.swing.JButton();
        oberon = new javax.swing.JButton();
        kripton = new javax.swing.JButton();
        efelio = new javax.swing.JButton();
        helio = new javax.swing.JButton();
        radon = new javax.swing.JButton();
        fluor = new javax.swing.JButton();
        cloro = new javax.swing.JButton();
        azufre = new javax.swing.JButton();
        argon = new javax.swing.JButton();
        europio = new javax.swing.JButton();
        californio = new javax.swing.JButton();
        terbio = new javax.swing.JButton();
        disprosio = new javax.swing.JButton();
        curio = new javax.swing.JButton();
        gadolinio = new javax.swing.JButton();
        berkelio = new javax.swing.JButton();
        einstenio = new javax.swing.JButton();
        holmio = new javax.swing.JButton();
        fermio = new javax.swing.JButton();
        iterbio = new javax.swing.JButton();
        nobelio = new javax.swing.JButton();
        mendelevio = new javax.swing.JButton();
        erbio = new javax.swing.JButton();
        tulio = new javax.swing.JButton();
        lutecio = new javax.swing.JButton();
        lawrencio = new javax.swing.JButton();
        actinio = new javax.swing.JButton();
        praseodimio = new javax.swing.JButton();
        protactinio = new javax.swing.JButton();
        torio = new javax.swing.JButton();
        lantano = new javax.swing.JButton();
        cerio = new javax.swing.JButton();
        neodimio = new javax.swing.JButton();
        plutonio = new javax.swing.JButton();
        samario = new javax.swing.JButton();
        americio = new javax.swing.JButton();
        neptunio = new javax.swing.JButton();
        uranio = new javax.swing.JButton();
        prometio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        metales1 = new javax.swing.JCheckBox();
        metaloides = new javax.swing.JCheckBox();
        nometales1 = new javax.swing.JCheckBox();
        borra = new javax.swing.JButton();
        ver2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        gas = new javax.swing.JCheckBox();
        liquido = new javax.swing.JCheckBox();
        solido = new javax.swing.JCheckBox();
        sintetico = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/001-hidrogeno.png"))); // NOI18N
        jButton99.setBorder(null);

        jButton100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/001-hidrogeno.png"))); // NOI18N
        jButton100.setBorder(null);

        jButton101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/001-hidrogeno.png"))); // NOI18N
        jButton101.setBorder(null);

        jButton102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/001-hidrogeno.png"))); // NOI18N
        jButton102.setBorder(null);

        jButton103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/001-hidrogeno.png"))); // NOI18N
        jButton103.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cesio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/065-metal-15.png"))); // NOI18N
        cesio.setBorder(null);
        cesio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cesio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/55.png"))); // NOI18N
        cesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cesioActionPerformed(evt);
            }
        });
        getContentPane().add(cesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        berilio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/033-elemento-quimico-2.png"))); // NOI18N
        berilio.setBorder(null);
        berilio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        berilio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/4.png"))); // NOI18N
        berilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berilioActionPerformed(evt);
            }
        });
        getContentPane().add(berilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        magnesio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/012-magnesio.png"))); // NOI18N
        magnesio.setBorder(null);
        magnesio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        magnesio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/12.png"))); // NOI18N
        magnesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magnesioActionPerformed(evt);
            }
        });
        getContentPane().add(magnesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        estroncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/055-estroncio.png"))); // NOI18N
        estroncio.setBorder(null);
        estroncio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estroncio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/38.png"))); // NOI18N
        estroncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estroncioActionPerformed(evt);
            }
        });
        getContentPane().add(estroncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        hidrogeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/001-hidrogeno.png"))); // NOI18N
        hidrogeno.setBorder(null);
        hidrogeno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hidrogeno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/1.png"))); // NOI18N
        hidrogeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidrogenoActionPerformed(evt);
            }
        });
        getContentPane().add(hidrogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        calcio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/009-calcio.png"))); // NOI18N
        calcio.setBorder(null);
        calcio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/20.png"))); // NOI18N
        calcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcioActionPerformed(evt);
            }
        });
        getContentPane().add(calcio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        potasio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/007-potasio.png"))); // NOI18N
        potasio.setBorder(null);
        potasio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        potasio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/19.png"))); // NOI18N
        potasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potasioActionPerformed(evt);
            }
        });
        getContentPane().add(potasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        radio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/049-radio.png"))); // NOI18N
        radio.setBorder(null);
        radio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/88.png"))); // NOI18N
        radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActionPerformed(evt);
            }
        });
        getContentPane().add(radio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 720, -1, -1));

        sodio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/003-sodio.png"))); // NOI18N
        sodio.setBorder(null);
        sodio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sodio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/11.png"))); // NOI18N
        sodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodioActionPerformed(evt);
            }
        });
        getContentPane().add(sodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        bario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/057-elemento-quimico-11.png"))); // NOI18N
        bario.setBorder(null);
        bario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/56.png"))); // NOI18N
        bario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barioActionPerformed(evt);
            }
        });
        getContentPane().add(bario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, -1, -1));

        litio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/002-litio.png"))); // NOI18N
        litio.setBorder(null);
        litio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        litio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/3.png"))); // NOI18N
        litio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                litioActionPerformed(evt);
            }
        });
        getContentPane().add(litio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        rubidio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/040-metal-3.png"))); // NOI18N
        rubidio.setBorder(null);
        rubidio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rubidio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/37.png"))); // NOI18N
        rubidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubidioActionPerformed(evt);
            }
        });
        getContentPane().add(rubidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, -1));

        francio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/076-metal-25.png"))); // NOI18N
        francio.setBorder(null);
        francio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        francio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/87.png"))); // NOI18N
        francio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                francioActionPerformed(evt);
            }
        });
        getContentPane().add(francio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, -1, -1));

        actinidos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        actinidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/estrella1.png"))); // NOI18N
        actinidos.setText("89-103");
        actinidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        actinidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actinidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actinidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actinidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actinidosMouseExited(evt);
            }
        });
        getContentPane().add(actinidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 720, 70, 70));

        cromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/020-cromo.png"))); // NOI18N
        cromo.setBorder(null);
        cromo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cromo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/24.png"))); // NOI18N
        cromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cromoActionPerformed(evt);
            }
        });
        getContentPane().add(cromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        vanadio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/026-vanadio.png"))); // NOI18N
        vanadio.setBorder(null);
        vanadio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vanadio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/23.png"))); // NOI18N
        vanadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanadioActionPerformed(evt);
            }
        });
        getContentPane().add(vanadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, -1, -1));

        tantalio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/060-metal-10.png"))); // NOI18N
        tantalio.setBorder(null);
        tantalio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tantalio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/73.png"))); // NOI18N
        tantalio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tantalioActionPerformed(evt);
            }
        });
        getContentPane().add(tantalio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, -1, -1));

        zirconio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/066-metal-16.png"))); // NOI18N
        zirconio.setBorder(null);
        zirconio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zirconio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/40.png"))); // NOI18N
        zirconio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zirconioActionPerformed(evt);
            }
        });
        getContentPane().add(zirconio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        niobio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/067-metal-17.png"))); // NOI18N
        niobio.setBorder(null);
        niobio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        niobio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/41.png"))); // NOI18N
        niobio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niobioActionPerformed(evt);
            }
        });
        getContentPane().add(niobio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, -1, -1));

        titanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/023-titanio.png"))); // NOI18N
        titanio.setBorder(null);
        titanio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titanio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/22.png"))); // NOI18N
        titanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titanioActionPerformed(evt);
            }
        });
        getContentPane().add(titanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));

        dubnio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/053-elemento-quimico-10.png"))); // NOI18N
        dubnio.setBorder(null);
        dubnio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dubnio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/105.png"))); // NOI18N
        dubnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubnioActionPerformed(evt);
            }
        });
        getContentPane().add(dubnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 720, -1, -1));

        itrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/027-metal.png"))); // NOI18N
        itrio.setBorder(null);
        itrio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        itrio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/39.png"))); // NOI18N
        itrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itrioActionPerformed(evt);
            }
        });
        getContentPane().add(itrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, -1, -1));

        ruthterfordio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/047-elemento-quimico-7.png"))); // NOI18N
        ruthterfordio.setBorder(null);
        ruthterfordio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ruthterfordio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/104.png"))); // NOI18N
        ruthterfordio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruthterfordioActionPerformed(evt);
            }
        });
        getContentPane().add(ruthterfordio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 720, -1, -1));

        escandio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/046-elemento-quimico-6.png"))); // NOI18N
        escandio.setBorder(null);
        escandio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escandio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/21.png"))); // NOI18N
        escandio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escandioActionPerformed(evt);
            }
        });
        getContentPane().add(escandio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        lantanio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lantanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/estrella1.png"))); // NOI18N
        lantanio.setText("57-71");
        lantanio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        lantanio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lantanio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lantanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lantanioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lantanioMouseExited(evt);
            }
        });
        getContentPane().add(lantanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 70, 70));

        hafnio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/042-elemento-quimico-4.png"))); // NOI18N
        hafnio.setBorder(null);
        hafnio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hafnio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/72.png"))); // NOI18N
        hafnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hafnioActionPerformed(evt);
            }
        });
        getContentPane().add(hafnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, -1));

        tungsteno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/034-tungsteno.png"))); // NOI18N
        tungsteno.setBorder(null);
        tungsteno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tungsteno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/74.png"))); // NOI18N
        tungsteno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tungstenoActionPerformed(evt);
            }
        });
        getContentPane().add(tungsteno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, -1, -1));

        hassio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/070-metal-20.png"))); // NOI18N
        hassio.setBorder(null);
        hassio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hassio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/108.png"))); // NOI18N
        hassio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hassioActionPerformed(evt);
            }
        });
        getContentPane().add(hassio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, -1, -1));

        osmio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/043-metal-4.png"))); // NOI18N
        osmio.setBorder(null);
        osmio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        osmio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/76.png"))); // NOI18N
        osmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osmioActionPerformed(evt);
            }
        });
        getContentPane().add(osmio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, -1, -1));

        rutenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/068-metal-18.png"))); // NOI18N
        rutenio.setBorder(null);
        rutenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rutenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/44.png"))); // NOI18N
        rutenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutenioActionPerformed(evt);
            }
        });
        getContentPane().add(rutenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, -1, -1));

        rodio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/062-metal-12.png"))); // NOI18N
        rodio.setBorder(null);
        rodio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rodio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/45.png"))); // NOI18N
        rodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rodioActionPerformed(evt);
            }
        });
        getContentPane().add(rodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, -1, -1));

        hierro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/004-hierro.png"))); // NOI18N
        hierro.setBorder(null);
        hierro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hierro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/26.png"))); // NOI18N
        hierro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hierroActionPerformed(evt);
            }
        });
        getContentPane().add(hierro, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, -1, -1));

        tecnecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/044-metal-5.png"))); // NOI18N
        tecnecio.setBorder(null);
        tecnecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tecnecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/43.png"))); // NOI18N
        tecnecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tecnecioActionPerformed(evt);
            }
        });
        getContentPane().add(tecnecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, -1, -1));

        bohrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/037-metal-2.png"))); // NOI18N
        bohrio.setBorder(null);
        bohrio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bohrio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/107.png"))); // NOI18N
        bohrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bohrioActionPerformed(evt);
            }
        });
        getContentPane().add(bohrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 720, -1, -1));

        manganeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/039-elemento-quimico-3.png"))); // NOI18N
        manganeso.setBorder(null);
        manganeso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manganeso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/25.png"))); // NOI18N
        manganeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manganesoActionPerformed(evt);
            }
        });
        getContentPane().add(manganeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, -1, -1));

        seaborgio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/115-elemento-quimico-49.png"))); // NOI18N
        seaborgio.setBorder(null);
        seaborgio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seaborgio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/106.png"))); // NOI18N
        seaborgio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaborgioActionPerformed(evt);
            }
        });
        getContentPane().add(seaborgio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 720, -1, -1));

        cobalto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/048-metal-6.png"))); // NOI18N
        cobalto.setBorder(null);
        cobalto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cobalto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/27.png"))); // NOI18N
        cobalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobaltoActionPerformed(evt);
            }
        });
        getContentPane().add(cobalto, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, -1, -1));

        renio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/058-metal-9.png"))); // NOI18N
        renio.setBorder(null);
        renio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        renio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/75.png"))); // NOI18N
        renio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renioActionPerformed(evt);
            }
        });
        getContentPane().add(renio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, -1, -1));

        molibdeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/061-metal-11.png"))); // NOI18N
        molibdeno.setBorder(null);
        molibdeno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        molibdeno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/42.png"))); // NOI18N
        molibdeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                molibdenoActionPerformed(evt);
            }
        });
        getContentPane().add(molibdeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));

        iridio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/063-metal-13.png"))); // NOI18N
        iridio.setBorder(null);
        iridio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iridio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/77.png"))); // NOI18N
        iridio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iridioActionPerformed(evt);
            }
        });
        getContentPane().add(iridio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, -1, -1));

        oro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/035-oro.png"))); // NOI18N
        oro.setBorder(null);
        oro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/79.png"))); // NOI18N
        oro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oroActionPerformed(evt);
            }
        });
        getContentPane().add(oro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 640, -1, -1));

        cobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/005-cobre.png"))); // NOI18N
        cobre.setBorder(null);
        cobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cobre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/29.png"))); // NOI18N
        cobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobreActionPerformed(evt);
            }
        });
        getContentPane().add(cobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 480, -1, -1));

        darmstadtio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/072-metal-22.png"))); // NOI18N
        darmstadtio.setBorder(null);
        darmstadtio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        darmstadtio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/110.png"))); // NOI18N
        darmstadtio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darmstadtioActionPerformed(evt);
            }
        });
        getContentPane().add(darmstadtio, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 720, -1, -1));

        platino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/036-platino.png"))); // NOI18N
        platino.setBorder(null);
        platino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        platino.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/78.png"))); // NOI18N
        platino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinoActionPerformed(evt);
            }
        });
        getContentPane().add(platino, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 640, -1, -1));

        plata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/022-plata.png"))); // NOI18N
        plata.setBorder(null);
        plata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plata.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/47.png"))); // NOI18N
        plata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plataActionPerformed(evt);
            }
        });
        getContentPane().add(plata, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, -1, -1));

        paladio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/056-metal-8.png"))); // NOI18N
        paladio.setBorder(null);
        paladio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paladio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/46.png"))); // NOI18N
        paladio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paladioActionPerformed(evt);
            }
        });
        getContentPane().add(paladio, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, -1, -1));

        roentgenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/073-metal-23.png"))); // NOI18N
        roentgenio.setBorder(null);
        roentgenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        roentgenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/111.png"))); // NOI18N
        roentgenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roentgenioActionPerformed(evt);
            }
        });
        getContentPane().add(roentgenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 720, -1, -1));

        niquel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/018-niquel.png"))); // NOI18N
        niquel.setBorder(null);
        niquel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        niquel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/28.png"))); // NOI18N
        niquel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niquelActionPerformed(evt);
            }
        });
        getContentPane().add(niquel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, -1, -1));

        meitnerio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/071-metal-21.png"))); // NOI18N
        meitnerio.setBorder(null);
        meitnerio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        meitnerio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/109.png"))); // NOI18N
        meitnerio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meitnerioActionPerformed(evt);
            }
        });
        getContentPane().add(meitnerio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 720, -1, -1));

        yodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/087-elemento-quimico-23.png"))); // NOI18N
        yodo.setBorder(null);
        yodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/53.png"))); // NOI18N
        yodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yodoActionPerformed(evt);
            }
        });
        getContentPane().add(yodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 560, -1, -1));

        fosforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/008-fosforo.png"))); // NOI18N
        fosforo.setBorder(null);
        fosforo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fosforo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/15.png"))); // NOI18N
        fosforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fosforoActionPerformed(evt);
            }
        });
        getContentPane().add(fosforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 400, -1, -1));

        zinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/015-zinc.png"))); // NOI18N
        zinc.setBorder(null);
        zinc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zinc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/30.png"))); // NOI18N
        zinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zincActionPerformed(evt);
            }
        });
        getContentPane().add(zinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 480, -1, -1));

        aluminio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/011-aluminio.png"))); // NOI18N
        aluminio.setBorder(null);
        aluminio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aluminio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/13.png"))); // NOI18N
        aluminio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluminioActionPerformed(evt);
            }
        });
        getContentPane().add(aluminio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 400, -1, -1));

        boro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/029-boro.png"))); // NOI18N
        boro.setBorder(null);
        boro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/5.png"))); // NOI18N
        boro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boroActionPerformed(evt);
            }
        });
        getContentPane().add(boro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 320, -1, -1));

        cadmio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/028-cadmio.png"))); // NOI18N
        cadmio.setBorder(null);
        cadmio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadmio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/48.png"))); // NOI18N
        cadmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadmioActionPerformed(evt);
            }
        });
        getContentPane().add(cadmio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 560, -1, -1));

        darwanzio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/074-metal-24.png"))); // NOI18N
        darwanzio.setBorder(null);
        darwanzio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        darwanzio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/112.png"))); // NOI18N
        darwanzio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darwanzioActionPerformed(evt);
            }
        });
        getContentPane().add(darwanzio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 720, -1, -1));

        nitrogeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/010-nitrogeno.png"))); // NOI18N
        nitrogeno.setBorder(null);
        nitrogeno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nitrogeno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/7.png"))); // NOI18N
        nitrogeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitrogenoActionPerformed(evt);
            }
        });
        getContentPane().add(nitrogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 320, -1, -1));

        mercurio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/024-mercurio.png"))); // NOI18N
        mercurio.setBorder(null);
        mercurio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mercurio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/80.png"))); // NOI18N
        mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioActionPerformed(evt);
            }
        });
        getContentPane().add(mercurio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, -1, -1));

        carbon.setBackground(new java.awt.Color(255, 255, 255));
        carbon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/006-carbon.png"))); // NOI18N
        carbon.setBorder(null);
        carbon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carbon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/6.png"))); // NOI18N
        carbon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbonActionPerformed(evt);
            }
        });
        getContentPane().add(carbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 320, -1, -1));

        silicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/016-silicio.png"))); // NOI18N
        silicio.setBorder(null);
        silicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/14.png"))); // NOI18N
        silicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silicioActionPerformed(evt);
            }
        });
        getContentPane().add(silicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 400, -1, -1));

        indio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/069-metal-19.png"))); // NOI18N
        indio.setBorder(null);
        indio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/49.png"))); // NOI18N
        indio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indioActionPerformed(evt);
            }
        });
        getContentPane().add(indio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 560, -1, -1));

        galio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/111-metal-27.png"))); // NOI18N
        galio.setBorder(null);
        galio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        galio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/31.png"))); // NOI18N
        galio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galioActionPerformed(evt);
            }
        });
        getContentPane().add(galio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 480, -1, -1));

        tustrano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/052-elemento-quimico-9.png"))); // NOI18N
        tustrano.setBorder(null);
        tustrano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tustrano.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/113.png"))); // NOI18N
        tustrano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tustranoActionPerformed(evt);
            }
        });
        getContentPane().add(tustrano, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 720, -1, -1));

        talio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/064-metal-14.png"))); // NOI18N
        talio.setBorder(null);
        talio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        talio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/81.png"))); // NOI18N
        talio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talioActionPerformed(evt);
            }
        });
        getContentPane().add(talio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 640, -1, -1));

        erristeneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/089-elemento-quimico-25.png"))); // NOI18N
        erristeneo.setBorder(null);
        erristeneo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        erristeneo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/114.png"))); // NOI18N
        erristeneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erristeneoActionPerformed(evt);
            }
        });
        getContentPane().add(erristeneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 720, -1, -1));

        bromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/081-elemento-quimico-17.png"))); // NOI18N
        bromo.setBorder(null);
        bromo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bromo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/35.png"))); // NOI18N
        bromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bromoActionPerformed(evt);
            }
        });
        getContentPane().add(bromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 480, -1, -1));

        selenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/110-elemento-quimico-46.png"))); // NOI18N
        selenio.setBorder(null);
        selenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/34.png"))); // NOI18N
        selenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selenioActionPerformed(evt);
            }
        });
        getContentPane().add(selenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 480, -1, -1));

        polonio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/088-elemento-quimico-24.png"))); // NOI18N
        polonio.setBorder(null);
        polonio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        polonio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/84.png"))); // NOI18N
        polonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polonioActionPerformed(evt);
            }
        });
        getContentPane().add(polonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 640, -1, -1));

        antimonio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/051-antimonio.png"))); // NOI18N
        antimonio.setBorder(null);
        antimonio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        antimonio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/51.png"))); // NOI18N
        antimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antimonioActionPerformed(evt);
            }
        });
        getContentPane().add(antimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 560, -1, -1));

        telurio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/112-metal-28.png"))); // NOI18N
        telurio.setBorder(null);
        telurio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telurio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/52.png"))); // NOI18N
        telurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telurioActionPerformed(evt);
            }
        });
        getContentPane().add(telurio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 560, -1, -1));

        arsenico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/019-arsenico.png"))); // NOI18N
        arsenico.setBorder(null);
        arsenico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arsenico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/33.png"))); // NOI18N
        arsenico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsenicoActionPerformed(evt);
            }
        });
        getContentPane().add(arsenico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 480, -1, -1));

        nectarten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/091-elemento-quimico-27.png"))); // NOI18N
        nectarten.setBorder(null);
        nectarten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nectarten.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/116.png"))); // NOI18N
        nectarten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nectartenActionPerformed(evt);
            }
        });
        getContentPane().add(nectarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 720, -1, -1));

        estaño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/079-metal-26.png"))); // NOI18N
        estaño.setBorder(null);
        estaño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estaño.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/50.png"))); // NOI18N
        estaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estañoActionPerformed(evt);
            }
        });
        getContentPane().add(estaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 560, -1, -1));

        merchel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/090-elemento-quimico-26.png"))); // NOI18N
        merchel.setBorder(null);
        merchel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        merchel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/115.png"))); // NOI18N
        merchel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merchelActionPerformed(evt);
            }
        });
        getContentPane().add(merchel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 720, -1, -1));

        germanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/050-elemento-quimico-8.png"))); // NOI18N
        germanio.setBorder(null);
        germanio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        germanio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/32.png"))); // NOI18N
        germanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                germanioActionPerformed(evt);
            }
        });
        getContentPane().add(germanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 480, -1, -1));

        plomo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/031-metal-1.png"))); // NOI18N
        plomo.setBorder(null);
        plomo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plomo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/82.png"))); // NOI18N
        plomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plomoActionPerformed(evt);
            }
        });
        getContentPane().add(plomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 640, -1, -1));

        bismuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/054-metal-7.png"))); // NOI18N
        bismuto.setBorder(null);
        bismuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bismuto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/83.png"))); // NOI18N
        bismuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bismutoActionPerformed(evt);
            }
        });
        getContentPane().add(bismuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 640, -1, -1));

        astato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/082-elemento-quimico-18.png"))); // NOI18N
        astato.setBorder(null);
        astato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        astato.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/85.png"))); // NOI18N
        astato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astatoActionPerformed(evt);
            }
        });
        getContentPane().add(astato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 640, -1, -1));

        oxigeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/013-oxigeno.png"))); // NOI18N
        oxigeno.setBorder(null);
        oxigeno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oxigeno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/8.png"))); // NOI18N
        oxigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxigenoActionPerformed(evt);
            }
        });
        getContentPane().add(oxigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 320, -1, -1));

        neon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/030-neon.png"))); // NOI18N
        neon.setBorder(null);
        neon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/10.png"))); // NOI18N
        neon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neonActionPerformed(evt);
            }
        });
        getContentPane().add(neon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 320, -1, -1));

        xenon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/041-xenon.png"))); // NOI18N
        xenon.setBorder(null);
        xenon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xenon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/54.png"))); // NOI18N
        xenon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xenonActionPerformed(evt);
            }
        });
        getContentPane().add(xenon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 560, -1, -1));

        oberon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/093-elemento-quimico-29.png"))); // NOI18N
        oberon.setBorder(null);
        oberon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oberon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/118.png"))); // NOI18N
        oberon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oberonActionPerformed(evt);
            }
        });
        getContentPane().add(oberon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 720, -1, -1));

        kripton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/109-elemento-quimico-45.png"))); // NOI18N
        kripton.setBorder(null);
        kripton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kripton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/36.png"))); // NOI18N
        kripton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kriptonActionPerformed(evt);
            }
        });
        getContentPane().add(kripton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 480, -1, -1));

        efelio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/092-elemento-quimico-28.png"))); // NOI18N
        efelio.setBorder(null);
        efelio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        efelio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/117.png"))); // NOI18N
        efelio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efelioActionPerformed(evt);
            }
        });
        getContentPane().add(efelio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 720, -1, -1));

        helio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/021-helio.png"))); // NOI18N
        helio.setBorder(null);
        helio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/2.png"))); // NOI18N
        helio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helioActionPerformed(evt);
            }
        });
        getContentPane().add(helio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 240, -1, -1));

        radon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/113-elemento-quimico-47.png"))); // NOI18N
        radon.setBorder(null);
        radon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/86.png"))); // NOI18N
        radon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radonActionPerformed(evt);
            }
        });
        getContentPane().add(radon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 640, -1, -1));

        fluor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/045-elemento-quimico-5.png"))); // NOI18N
        fluor.setBorder(null);
        fluor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fluor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/9.png"))); // NOI18N
        fluor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fluorActionPerformed(evt);
            }
        });
        getContentPane().add(fluor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 320, -1, -1));

        cloro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/014-cloro.png"))); // NOI18N
        cloro.setBorder(null);
        cloro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cloro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/17.png"))); // NOI18N
        cloro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cloroActionPerformed(evt);
            }
        });
        getContentPane().add(cloro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 400, -1, -1));

        azufre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/017-azufre.png"))); // NOI18N
        azufre.setBorder(null);
        azufre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        azufre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/16.png"))); // NOI18N
        azufre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azufreActionPerformed(evt);
            }
        });
        getContentPane().add(azufre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 400, -1, -1));

        argon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/077-elemento-quimico-14.png"))); // NOI18N
        argon.setBorder(null);
        argon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        argon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/18.png"))); // NOI18N
        argon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                argonActionPerformed(evt);
            }
        });
        getContentPane().add(argon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 400, -1, -1));

        europio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/078-elemento-quimico-15.png"))); // NOI18N
        europio.setBorder(null);
        europio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        europio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/63.png"))); // NOI18N
        europio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                europioActionPerformed(evt);
            }
        });
        getContentPane().add(europio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 850, -1, -1));

        californio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/106-elemento-quimico-42.png"))); // NOI18N
        californio.setBorder(null);
        californio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        californio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/98.png"))); // NOI18N
        californio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                californioActionPerformed(evt);
            }
        });
        getContentPane().add(californio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 980, -1, -1));

        terbio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/084-elemento-quimico-20.png"))); // NOI18N
        terbio.setBorder(null);
        terbio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        terbio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/65.png"))); // NOI18N
        terbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terbioActionPerformed(evt);
            }
        });
        getContentPane().add(terbio, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 850, -1, -1));

        disprosio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/086-elemento-quimico-22.png"))); // NOI18N
        disprosio.setBorder(null);
        disprosio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disprosio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/66.png"))); // NOI18N
        disprosio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disprosioActionPerformed(evt);
            }
        });
        getContentPane().add(disprosio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 850, -1, -1));

        curio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/104-elemento-quimico-40.png"))); // NOI18N
        curio.setBorder(null);
        curio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/96.png"))); // NOI18N
        curio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curioActionPerformed(evt);
            }
        });
        getContentPane().add(curio, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 980, -1, -1));

        gadolinio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/095-elemento-quimico-31.png"))); // NOI18N
        gadolinio.setBorder(null);
        gadolinio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gadolinio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/64.png"))); // NOI18N
        gadolinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gadolinioActionPerformed(evt);
            }
        });
        getContentPane().add(gadolinio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 850, -1, -1));

        berkelio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/105-elemento-quimico-41.png"))); // NOI18N
        berkelio.setBorder(null);
        berkelio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        berkelio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/97.png"))); // NOI18N
        berkelio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berkelioActionPerformed(evt);
            }
        });
        getContentPane().add(berkelio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 980, -1, -1));

        einstenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/107-elemento-quimico-43.png"))); // NOI18N
        einstenio.setBorder(null);
        einstenio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        einstenio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/99.png"))); // NOI18N
        einstenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                einstenioActionPerformed(evt);
            }
        });
        getContentPane().add(einstenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 980, -1, -1));

        holmio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/096-elemento-quimico-32.png"))); // NOI18N
        holmio.setBorder(null);
        holmio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        holmio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/67.png"))); // NOI18N
        holmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holmioActionPerformed(evt);
            }
        });
        getContentPane().add(holmio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 850, -1, -1));

        fermio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/108-elemento-quimico-44.png"))); // NOI18N
        fermio.setBorder(null);
        fermio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fermio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/100.png"))); // NOI18N
        fermio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermioActionPerformed(evt);
            }
        });
        getContentPane().add(fermio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 980, -1, -1));

        iterbio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/025-elemento-quimico.png"))); // NOI18N
        iterbio.setBorder(null);
        iterbio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iterbio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/70.png"))); // NOI18N
        iterbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iterbioActionPerformed(evt);
            }
        });
        getContentPane().add(iterbio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 850, -1, -1));

        nobelio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/117-elemento-quimico-51.png"))); // NOI18N
        nobelio.setBorder(null);
        nobelio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nobelio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/102.png"))); // NOI18N
        nobelio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nobelioActionPerformed(evt);
            }
        });
        getContentPane().add(nobelio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 980, -1, -1));

        mendelevio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/114-elemento-quimico-48.png"))); // NOI18N
        mendelevio.setBorder(null);
        mendelevio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mendelevio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/101.png"))); // NOI18N
        mendelevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mendelevioActionPerformed(evt);
            }
        });
        getContentPane().add(mendelevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 980, -1, -1));

        erbio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/097-elemento-quimico-33.png"))); // NOI18N
        erbio.setBorder(null);
        erbio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        erbio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/68.png"))); // NOI18N
        erbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erbioActionPerformed(evt);
            }
        });
        getContentPane().add(erbio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 850, -1, -1));

        tulio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/098-elemento-quimico-34.png"))); // NOI18N
        tulio.setBorder(null);
        tulio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tulio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/69.png"))); // NOI18N
        tulio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tulioActionPerformed(evt);
            }
        });
        getContentPane().add(tulio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 850, -1, -1));

        lutecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/116-elemento-quimico-50.png"))); // NOI18N
        lutecio.setBorder(null);
        lutecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lutecio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/71.png"))); // NOI18N
        lutecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lutecioActionPerformed(evt);
            }
        });
        getContentPane().add(lutecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 850, -1, -1));

        lawrencio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/118-elemento-quimico-52.png"))); // NOI18N
        lawrencio.setBorder(null);
        lawrencio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lawrencio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/103.png"))); // NOI18N
        lawrencio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lawrencioActionPerformed(evt);
            }
        });
        getContentPane().add(lawrencio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 980, -1, -1));

        actinio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/099-elemento-quimico-35.png"))); // NOI18N
        actinio.setBorder(null);
        actinio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actinio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/89.png"))); // NOI18N
        actinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actinioActionPerformed(evt);
            }
        });
        getContentPane().add(actinio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 980, -1, -1));

        praseodimio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/080-elemento-quimico-16.png"))); // NOI18N
        praseodimio.setBorder(null);
        praseodimio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        praseodimio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/59.png"))); // NOI18N
        praseodimio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                praseodimioActionPerformed(evt);
            }
        });
        getContentPane().add(praseodimio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 850, -1, -1));

        protactinio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/085-elemento-quimico-21.png"))); // NOI18N
        protactinio.setBorder(null);
        protactinio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        protactinio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/91.png"))); // NOI18N
        protactinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protactinioActionPerformed(evt);
            }
        });
        getContentPane().add(protactinio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 980, -1, -1));

        torio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/100-elemento-quimico-36.png"))); // NOI18N
        torio.setBorder(null);
        torio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        torio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/90.png"))); // NOI18N
        torio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torioActionPerformed(evt);
            }
        });
        getContentPane().add(torio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 980, -1, -1));

        lantano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/075-elemento-quimico-13.png"))); // NOI18N
        lantano.setBorder(null);
        lantano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lantano.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/57.png"))); // NOI18N
        lantano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lantanoActionPerformed(evt);
            }
        });
        getContentPane().add(lantano, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 850, -1, -1));

        cerio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/059-elemento-quimico-12.png"))); // NOI18N
        cerio.setBorder(null);
        cerio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/58.png"))); // NOI18N
        cerio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerioActionPerformed(evt);
            }
        });
        getContentPane().add(cerio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 850, -1, -1));

        neodimio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/083-elemento-quimico-19.png"))); // NOI18N
        neodimio.setBorder(null);
        neodimio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neodimio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/60.png"))); // NOI18N
        neodimio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neodimioActionPerformed(evt);
            }
        });
        getContentPane().add(neodimio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 850, -1, -1));

        plutonio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/038-plutonio.png"))); // NOI18N
        plutonio.setBorder(null);
        plutonio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plutonio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/94.png"))); // NOI18N
        plutonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plutonioActionPerformed(evt);
            }
        });
        getContentPane().add(plutonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 980, -1, -1));

        samario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/032-elemento-quimico-1.png"))); // NOI18N
        samario.setBorder(null);
        samario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        samario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/62.png"))); // NOI18N
        samario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samarioActionPerformed(evt);
            }
        });
        getContentPane().add(samario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 850, -1, -1));

        americio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/103-elemento-quimico-39.png"))); // NOI18N
        americio.setBorder(null);
        americio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        americio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/95.png"))); // NOI18N
        americio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americioActionPerformed(evt);
            }
        });
        getContentPane().add(americio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 980, -1, -1));

        neptunio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/102-elemento-quimico-38.png"))); // NOI18N
        neptunio.setBorder(null);
        neptunio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neptunio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/93.png"))); // NOI18N
        neptunio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neptunioActionPerformed(evt);
            }
        });
        getContentPane().add(neptunio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 980, -1, -1));

        uranio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/101-elemento-quimico-37.png"))); // NOI18N
        uranio.setBorder(null);
        uranio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uranio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/92.png"))); // NOI18N
        uranio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranioActionPerformed(evt);
            }
        });
        getContentPane().add(uranio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 980, -1, -1));

        prometio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/094-elemento-quimico-30.png"))); // NOI18N
        prometio.setBorder(null);
        prometio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prometio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/61.png"))); // NOI18N
        prometio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prometioActionPerformed(evt);
            }
        });
        getContentPane().add(prometio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 850, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 71));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, 71));

        grupos.add(metales1);
        metales1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        metales1.setText("METALES ");
        getContentPane().add(metales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        grupos.add(metaloides);
        metaloides.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        metaloides.setText("METALOIDES");
        getContentPane().add(metaloides, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        grupos.add(nometales1);
        nometales1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nometales1.setText("NO METALES ");
        getContentPane().add(nometales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        borra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/pintar1.png"))); // NOI18N
        borra.setText("PINTAR");
        borra.setContentAreaFilled(false);
        borra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        borra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraActionPerformed(evt);
            }
        });
        getContentPane().add(borra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, -1, -1));

        ver2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/vision1.png"))); // NOI18N
        ver2.setText("VER ");
        ver2.setContentAreaFilled(false);
        ver2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ver2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver2ActionPerformed(evt);
            }
        });
        getContentPane().add(ver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 20, 16));
        jLabel1.setText("SIMBOLOGIA ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 20, 70));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 20, 70));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 20, 70));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 850, 20, 70));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setText("7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 980, 20, 60));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 310, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("METALES PESADOS ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 80));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 390, -1, 90));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("lA");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 70, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 70, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("llA");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 70, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("2");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 70, -1));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("lllB");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 70, -1));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("3");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 70, -1));

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("lVB");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 70, -1));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("4");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 70, -1));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("lA");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 70, -1));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("5");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 70, -1));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("lA");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 70, -1));

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("6");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 70, -1));

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("lA");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 70, -1));

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("10");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 70, -1));

        jLabel28.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("lB");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 450, 70, -1));

        jLabel29.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("11");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 430, 70, -1));

        jLabel30.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("VlllB");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 70, -1));

        jLabel31.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("9");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 70, -1));

        jLabel32.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("llB");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 70, -1));

        jLabel33.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("12");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 430, 70, -1));

        jLabel34.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("lllA");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 290, 70, -1));

        jLabel35.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("13");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 270, 70, -1));

        jLabel36.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("lVA");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 290, 70, -1));

        jLabel37.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("14");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 270, 70, -1));

        jLabel38.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("VA");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 290, 70, -1));

        jLabel39.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("15");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 270, 70, -1));

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("VlA");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 290, 70, -1));

        jLabel41.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("16");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 270, 70, -1));

        jLabel42.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("VllA");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 290, 70, -1));

        jLabel43.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("17");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 270, 70, -1));

        jLabel44.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("VllA");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 210, 70, -1));

        jLabel45.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("18");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 190, 70, -1));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, -1, 40));

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 440, -1, 40));

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 100, -1));

        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 90, -1));

        jLabel50.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("7");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 70, -1));

        jLabel51.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("8");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 70, -1));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(4, 27, 29));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("TABLA PERIÓDICA DE LOS ELEMENTOS QUÍMICOS  ");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        grupos.add(gas);
        gas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gas.setText("GAS");
        getContentPane().add(gas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        grupos.add(liquido);
        liquido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        liquido.setText("LÍQUIDO");
        getContentPane().add(liquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        grupos.add(solido);
        solido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        solido.setText("SÓLIDO");
        getContentPane().add(solido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        grupos.add(sintetico);
        sintetico.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sintetico.setText("SINTÉTICO");
        getContentPane().add(sintetico, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        jLabel53.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/estrella1.png"))); // NOI18N
        jLabel53.setText("SERIE  DE LOS LANTÁNIDOS");
        jLabel53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel53.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 800, -1, -1));

        jLabel54.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/estrella1.png"))); // NOI18N
        jLabel54.setText("SERIE DE LOS ACTÍNIDOS");
        jLabel54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel54.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 930, -1, -1));

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 290, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setText("6");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 20, 70));

        jLabel56.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel56.setText("7");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, 20, 60));

        jLabel57.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel57.setText("H");
        jLabel57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 200, 50, 60));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel58.setText("1");
        jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 20, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel59.setText("HIDRÓGENO");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, -1, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel60.setText("1,00797");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 270, 90, -1));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setText("+1");
        jLabel63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 160, 30, 40));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setText("Nombre Químico ");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, -1, 40));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Simbolo");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 60, 30));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel64.setText("No. Atómico ");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 100, 30));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("Masa Atómica ");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 100, 40));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel66.setText("Estado de Oxidación");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 160, -1, 40));

        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 174, 70, -1));

        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 180, 50, -1));

        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 120, -1));

        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 80, -1));

        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 40, -1));

        jButton1.setBackground(new java.awt.Color(138, 240, 53));
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 190, 230));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/salida2.png"))); // NOI18N
        jButton3.setText("SALIR ");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 880, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/casa2.png"))); // NOI18N
        jButton4.setText("INICIO");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 880, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver2ActionPerformed
      if(nometales1.isSelected()){
           carbon.setBackground(Color.GREEN);
          nitrogeno.setBackground(Color.GREEN);
          oxigeno.setBackground(Color.GREEN);
          fluor.setBackground(Color.GREEN);
          helio.setBackground(Color.GREEN);
          neon.setBackground(Color.GREEN);
          argon.setBackground(Color.GREEN);
          kripton.setBackground(Color.GREEN);
          xenon.setBackground(Color.GREEN);
          radon.setBackground(Color.GREEN);
          fosforo.setBackground(Color.GREEN);
          azufre.setBackground(Color.GREEN);
          cloro.setBackground(Color.GREEN);
          selenio.setBackground(Color.GREEN);
          bromo.setBackground(Color.GREEN);
          yodo.setBackground(Color.GREEN);
          astato.setBackground(Color.GREEN);
          hidrogeno.setBackground(Color.GREEN);
//          metaloides
          boro.setBackground(Color.GRAY);
          silicio.setBackground(Color.GRAY);
          germanio.setBackground(Color.GRAY);
          arsenico.setBackground(Color.GRAY);
          antimonio.setBackground(Color.GRAY);
          telurio.setBackground(Color.GRAY);
          polonio.setBackground(Color.GRAY);
//          metales
          litio.setBackground(Color.GRAY);
          sodio.setBackground(Color.GRAY);
          potasio.setBackground(Color.GRAY);
          rubidio.setBackground(Color.GRAY);
          cesio.setBackground(Color.GRAY);
          francio.setBackground(Color.GRAY);
          berilio.setBackground(Color.GRAY);
          magnesio.setBackground(Color.GRAY);
          calcio.setBackground(Color.GRAY);
          estroncio.setBackground(Color.GRAY);
          bario.setBackground(Color.GRAY);
          radio.setBackground(Color.GRAY);
          escandio.setBackground(Color.GRAY);
          itrio.setBackground(Color.GRAY);
          titanio.setBackground(Color.GRAY);
          zirconio.setBackground(Color.GRAY);
          hafnio.setBackground(Color.GRAY);
          ruthterfordio.setBackground(Color.GRAY);
          vanadio.setBackground(Color.GRAY);
          niobio.setBackground(Color.GRAY);
          tantalio.setBackground(Color.GRAY);
          dubnio.setBackground(Color.GRAY);
          cromo.setBackground(Color.GRAY);
          molibdeno.setBackground(Color.GRAY);
          tungsteno.setBackground(Color.GRAY);
          seaborgio.setBackground(Color.GRAY);
          manganeso.setBackground(Color.GRAY);
          tecnecio.setBackground(Color.GRAY);
          renio.setBackground(Color.GRAY);
          bohrio.setBackground(Color.GRAY);
          hierro.setBackground(Color.GRAY);
          rutenio.setBackground(Color.GRAY);
          osmio.setBackground(Color.GRAY);
          hassio.setBackground(Color.GRAY);
          cobalto.setBackground(Color.GRAY);
          rodio.setBackground(Color.GRAY);
          iridio.setBackground(Color.GRAY);
          meitnerio.setBackground(Color.GRAY);
          niquel.setBackground(Color.GRAY);
          paladio.setBackground(Color.GRAY);
          platino.setBackground(Color.GRAY);
          darmstadtio.setBackground(Color.GRAY);
          cobre.setBackground(Color.GRAY);
          plata.setBackground(Color.GRAY);
          oro.setBackground(Color.GRAY);
          roentgenio.setBackground(Color.GRAY);
          zinc.setBackground(Color.GRAY);
          cadmio.setBackground(Color.GRAY);
          mercurio.setBackground(Color.GRAY);
          darwanzio.setBackground(Color.GRAY);
          aluminio.setBackground(Color.GRAY);
          galio.setBackground(Color.GRAY);
          indio.setBackground(Color.GRAY);
          talio.setBackground(Color.GRAY);
          tustrano.setBackground(Color.GRAY);
          estaño.setBackground(Color.GRAY);
          plomo.setBackground(Color.GRAY);
          erristeneo.setBackground(Color.GRAY);
          bismuto.setBackground(Color.GRAY);
          merchel.setBackground(Color.GRAY);
          nectarten.setBackground(Color.GRAY);
          efelio.setBackground(Color.GRAY);
          oberon.setBackground(Color.GRAY);
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
          
          } 
      if(metaloides.isSelected()){
            boro.setBackground(Color.RED);
          silicio.setBackground(Color.RED);
          germanio.setBackground(Color.RED);
          antimonio.setBackground(Color.RED);
          telurio.setBackground(Color.RED);
          polonio.setBackground(Color.RED);
          arsenico.setBackground(Color.RED);
          arsenico.setBackground(Color.RED);
//          no metales
          carbon.setBackground(Color.GRAY);
          nitrogeno.setBackground(Color.GRAY);
          oxigeno.setBackground(Color.GRAY);
          fluor.setBackground(Color.GRAY);
          helio.setBackground(Color.GRAY);
          neon.setBackground(Color.GRAY);
          argon.setBackground(Color.GRAY);
          kripton.setBackground(Color.GRAY);
          xenon.setBackground(Color.GRAY);
          radon.setBackground(Color.GRAY);
          fosforo.setBackground(Color.GRAY);
          azufre.setBackground(Color.GRAY);
          cloro.setBackground(Color.GRAY);
          selenio.setBackground(Color.GRAY);
          bromo.setBackground(Color.GRAY);
          yodo.setBackground(Color.GRAY);
          astato.setBackground(Color.GRAY);
          hidrogeno.setBackground(Color.GRAY);
//          metales
          litio.setBackground(Color.GRAY);
          sodio.setBackground(Color.GRAY);
          potasio.setBackground(Color.GRAY);
          rubidio.setBackground(Color.GRAY);
          cesio.setBackground(Color.GRAY);
          francio.setBackground(Color.GRAY);
          berilio.setBackground(Color.GRAY);
          magnesio.setBackground(Color.GRAY);
          calcio.setBackground(Color.GRAY);
          estroncio.setBackground(Color.GRAY);
          bario.setBackground(Color.GRAY);
          radio.setBackground(Color.GRAY);
          escandio.setBackground(Color.GRAY);
          itrio.setBackground(Color.GRAY);
          titanio.setBackground(Color.GRAY);
          zirconio.setBackground(Color.GRAY);
          hafnio.setBackground(Color.GRAY);
          ruthterfordio.setBackground(Color.GRAY);
          vanadio.setBackground(Color.GRAY);
          niobio.setBackground(Color.GRAY);
          tantalio.setBackground(Color.GRAY);
          dubnio.setBackground(Color.GRAY);
          cromo.setBackground(Color.GRAY);
          molibdeno.setBackground(Color.GRAY);
          tungsteno.setBackground(Color.GRAY);
          seaborgio.setBackground(Color.GRAY);
          manganeso.setBackground(Color.GRAY);
          tecnecio.setBackground(Color.GRAY);
          renio.setBackground(Color.GRAY);
          bohrio.setBackground(Color.GRAY);
          hierro.setBackground(Color.GRAY);
          rutenio.setBackground(Color.GRAY);
          osmio.setBackground(Color.GRAY);
          hassio.setBackground(Color.GRAY);
          cobalto.setBackground(Color.GRAY);
          rodio.setBackground(Color.GRAY);
          iridio.setBackground(Color.GRAY);
          meitnerio.setBackground(Color.GRAY);
          niquel.setBackground(Color.GRAY);
          paladio.setBackground(Color.GRAY);
          platino.setBackground(Color.GRAY);
          darmstadtio.setBackground(Color.GRAY);
          cobre.setBackground(Color.GRAY);
          plata.setBackground(Color.GRAY);
          oro.setBackground(Color.GRAY);
          roentgenio.setBackground(Color.GRAY);
          zinc.setBackground(Color.GRAY);
          cadmio.setBackground(Color.GRAY);
          mercurio.setBackground(Color.GRAY);
          darwanzio.setBackground(Color.GRAY);
          aluminio.setBackground(Color.GRAY);
          galio.setBackground(Color.GRAY);
          indio.setBackground(Color.GRAY);
          talio.setBackground(Color.GRAY);
          tustrano.setBackground(Color.GRAY);
          estaño.setBackground(Color.GRAY);
          plomo.setBackground(Color.GRAY);
          erristeneo.setBackground(Color.GRAY);
          bismuto.setBackground(Color.GRAY);
          merchel.setBackground(Color.GRAY);
          nectarten.setBackground(Color.GRAY);
          efelio.setBackground(Color.GRAY);
          oberon.setBackground(Color.GRAY);
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
          
          
         
      }
      if(metales1.isSelected()){
            litio.setBackground(Color.YELLOW);
          sodio.setBackground(Color.YELLOW);
          potasio.setBackground(Color.YELLOW);
          rubidio.setBackground(Color.YELLOW);
          cesio.setBackground(Color.YELLOW);
          francio.setBackground(Color.YELLOW);
          berilio.setBackground(Color.YELLOW);
          magnesio.setBackground(Color.YELLOW);
          calcio.setBackground(Color.YELLOW);
          estroncio.setBackground(Color.YELLOW);
          bario.setBackground(Color.YELLOW);
          radio.setBackground(Color.YELLOW);
          escandio.setBackground(Color.YELLOW);
          itrio.setBackground(Color.YELLOW);
          titanio.setBackground(Color.YELLOW);
          zirconio.setBackground(Color.YELLOW);
          hafnio.setBackground(Color.YELLOW);
          ruthterfordio.setBackground(Color.YELLOW);
          vanadio.setBackground(Color.YELLOW);
          niobio.setBackground(Color.YELLOW);
          tantalio.setBackground(Color.YELLOW);
          dubnio.setBackground(Color.YELLOW);
          cromo.setBackground(Color.YELLOW);
          molibdeno.setBackground(Color.YELLOW);
          tungsteno.setBackground(Color.YELLOW);
          seaborgio.setBackground(Color.YELLOW);
          manganeso.setBackground(Color.YELLOW);
          tecnecio.setBackground(Color.YELLOW);
          renio.setBackground(Color.YELLOW);
          bohrio.setBackground(Color.YELLOW);
          hierro.setBackground(Color.YELLOW);
          rutenio.setBackground(Color.YELLOW);
          osmio.setBackground(Color.YELLOW);
          hassio.setBackground(Color.YELLOW);
          cobalto.setBackground(Color.YELLOW);
          rodio.setBackground(Color.YELLOW);
          iridio.setBackground(Color.YELLOW);
          meitnerio.setBackground(Color.YELLOW);
          niquel.setBackground(Color.YELLOW);
          paladio.setBackground(Color.YELLOW);
          platino.setBackground(Color.YELLOW);
          darmstadtio.setBackground(Color.YELLOW);
          cobre.setBackground(Color.YELLOW);
          plata.setBackground(Color.YELLOW);
          oro.setBackground(Color.YELLOW);
          roentgenio.setBackground(Color.YELLOW);
          zinc.setBackground(Color.YELLOW);
          cadmio.setBackground(Color.YELLOW);
          mercurio.setBackground(Color.YELLOW);
          darwanzio.setBackground(Color.YELLOW);
          aluminio.setBackground(Color.YELLOW);
          galio.setBackground(Color.YELLOW);
          indio.setBackground(Color.YELLOW);
          talio.setBackground(Color.YELLOW);
          tustrano.setBackground(Color.YELLOW);
          estaño.setBackground(Color.YELLOW);
          plomo.setBackground(Color.YELLOW);
          erristeneo.setBackground(Color.YELLOW);
          bismuto.setBackground(Color.YELLOW);
          merchel.setBackground(Color.YELLOW);
          nectarten.setBackground(Color.YELLOW);
          efelio.setBackground(Color.YELLOW);
          oberon.setBackground(Color.YELLOW);
          lantano.setBackground(Color.YELLOW);
          cerio.setBackground(Color.YELLOW);
          praseodimio.setBackground(Color.YELLOW);
          neodimio.setBackground(Color.YELLOW);
          prometio.setBackground(Color.YELLOW);
          samario.setBackground(Color.YELLOW);
          europio.setBackground(Color.YELLOW);
          gadolinio.setBackground(Color.YELLOW);
          terbio.setBackground(Color.YELLOW);
          disprosio.setBackground(Color.YELLOW);
          holmio.setBackground(Color.YELLOW);
          erbio.setBackground(Color.YELLOW);
          tulio.setBackground(Color.YELLOW);
          iterbio.setBackground(Color.YELLOW);
          lutecio.setBackground(Color.YELLOW);
          actinio.setBackground(Color.YELLOW);
          torio.setBackground(Color.YELLOW);
          protactinio.setBackground(Color.YELLOW);
          uranio.setBackground(Color.YELLOW);
          neptunio.setBackground(Color.YELLOW);
          plutonio.setBackground(Color.YELLOW);
          americio.setBackground(Color.YELLOW);
          curio.setBackground(Color.YELLOW);
          berkelio.setBackground(Color.YELLOW);
          californio.setBackground(Color.YELLOW);
          einstenio.setBackground(Color.YELLOW);
          fermio.setBackground(Color.YELLOW);
          mendelevio.setBackground(Color.YELLOW);
          nobelio.setBackground(Color.YELLOW);
          lawrencio.setBackground(Color.YELLOW);
//          no metales
          carbon.setBackground(Color.GRAY);
          nitrogeno.setBackground(Color.GRAY);
          oxigeno.setBackground(Color.GRAY);
          fluor.setBackground(Color.GRAY);
          helio.setBackground(Color.GRAY);
          neon.setBackground(Color.GRAY);
          argon.setBackground(Color.GRAY);
          kripton.setBackground(Color.GRAY);
          xenon.setBackground(Color.GRAY);
          radon.setBackground(Color.GRAY);
          fosforo.setBackground(Color.GRAY);
          azufre.setBackground(Color.GRAY);
          cloro.setBackground(Color.GRAY);
          selenio.setBackground(Color.GRAY);
          bromo.setBackground(Color.GRAY);
          yodo.setBackground(Color.GRAY);
          astato.setBackground(Color.GRAY);
          hidrogeno.setBackground(Color.GRAY);
//          mataloides
          boro.setBackground(Color.GRAY);
          silicio.setBackground(Color.GRAY);
          germanio.setBackground(Color.GRAY);
          antimonio.setBackground(Color.GRAY);
          telurio.setBackground(Color.GRAY);
          polonio.setBackground(Color.GRAY);
          arsenico.setBackground(Color.GRAY);
         }
      if(gas.isSelected()){
          helio.setBackground(Color.MAGENTA);
          neon.setBackground(Color.MAGENTA);
          argon.setBackground(Color.MAGENTA);
          kripton.setBackground(Color.MAGENTA);
          xenon.setBackground(Color.MAGENTA);
          radon.setBackground(Color.MAGENTA);
          hidrogeno.setBackground(Color.MAGENTA);
          nitrogeno.setBackground(Color.MAGENTA);
          oxigeno.setBackground(Color.MAGENTA);
          fluor.setBackground(Color.MAGENTA);
          cloro.setBackground(Color.MAGENTA);
          
          francio.setBackground(Color.GRAY);
          mercurio.setBackground(Color.GRAY);
          bromo.setBackground(Color.GRAY);
          
          litio.setBackground(Color.GRAY);
          sodio.setBackground(Color.GRAY);
          potasio.setBackground(Color.GRAY);
          rubidio.setBackground(Color.GRAY);
          cesio.setBackground(Color.GRAY);
          berilio.setBackground(Color.GRAY);
          magnesio.setBackground(Color.GRAY);
          calcio.setBackground(Color.GRAY);
          estroncio.setBackground(Color.GRAY);
          bario.setBackground(Color.GRAY);
          radio.setBackground(Color.GRAY);
          escandio.setBackground(Color.GRAY);
          itrio.setBackground(Color.GRAY);
          titanio.setBackground(Color.GRAY);
          zirconio.setBackground(Color.GRAY);
          hafnio.setBackground(Color.GRAY);
          vanadio.setBackground(Color.GRAY);
          niobio.setBackground(Color.GRAY);
          tantalio.setBackground(Color.GRAY);
          cromo.setBackground(Color.GRAY);
          molibdeno.setBackground(Color.GRAY);
          tungsteno.setBackground(Color.GRAY);
          manganeso.setBackground(Color.GRAY);
          renio.setBackground(Color.GRAY);
          hierro.setBackground(Color.GRAY);
          rutenio.setBackground(Color.GRAY);
          osmio.setBackground(Color.GRAY);
          cobalto.setBackground(Color.GRAY);
          rodio.setBackground(Color.GRAY);
          iridio.setBackground(Color.GRAY);
          niquel.setBackground(Color.GRAY);
          paladio.setBackground(Color.GRAY);
          platino.setBackground(Color.GRAY);
          cobre.setBackground(Color.GRAY);
          plata.setBackground(Color.GRAY);
          oro.setBackground(Color.GRAY);
          zinc.setBackground(Color.GRAY);
          cadmio.setBackground(Color.GRAY);
          aluminio.setBackground(Color.GRAY);
          galio.setBackground(Color.GRAY);
          indio.setBackground(Color.GRAY);
          talio.setBackground(Color.GRAY);
          estaño.setBackground(Color.GRAY);
          plomo.setBackground(Color.GRAY);
          bismuto.setBackground(Color.GRAY);
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          yodo.setBackground(Color.GRAY);
          astato.setBackground(Color.GRAY);
          selenio.setBackground(Color.GRAY);
          fosforo.setBackground(Color.GRAY);
          azufre.setBackground(Color.GRAY);
          carbon.setBackground(Color.GRAY);
          boro.setBackground(Color.GRAY);
          silicio.setBackground(Color.GRAY);
          germanio.setBackground(Color.GRAY);
          antimonio.setBackground(Color.GRAY);
          telurio.setBackground(Color.GRAY);
          polonio.setBackground(Color.GRAY);
          arsenico.setBackground(Color.GRAY);
          
           ruthterfordio.setBackground(Color.GRAY);
          dubnio.setBackground(Color.GRAY);
          seaborgio.setBackground(Color.GRAY);
          tecnecio.setBackground(Color.GRAY);
          bohrio.setBackground(Color.GRAY);
          hassio.setBackground(Color.GRAY);
          meitnerio.setBackground(Color.GRAY);
          darmstadtio.setBackground(Color.GRAY);
          roentgenio.setBackground(Color.GRAY);
          darwanzio.setBackground(Color.GRAY);
          tustrano.setBackground(Color.GRAY);
          erristeneo.setBackground(Color.GRAY);
          merchel.setBackground(Color.GRAY);
          nectarten.setBackground(Color.GRAY);
          efelio.setBackground(Color.GRAY);
          oberon.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
      }
      if(liquido.isSelected()){
          francio.setBackground(Color.CYAN);
          mercurio.setBackground(Color.CYAN);
          bromo.setBackground(Color.CYAN);
          
            helio.setBackground(Color.GRAY);
          neon.setBackground(Color.GRAY);
          argon.setBackground(Color.GRAY);
          kripton.setBackground(Color.GRAY);
          xenon.setBackground(Color.GRAY);
          radon.setBackground(Color.GRAY);
          hidrogeno.setBackground(Color.GRAY);
          nitrogeno.setBackground(Color.GRAY);
          oxigeno.setBackground(Color.GRAY);
          fluor.setBackground(Color.GRAY);
          cloro.setBackground(Color.GRAY);
          
          litio.setBackground(Color.GRAY);
          sodio.setBackground(Color.GRAY);
          potasio.setBackground(Color.GRAY);
          rubidio.setBackground(Color.GRAY);
          cesio.setBackground(Color.GRAY);
          berilio.setBackground(Color.GRAY);
          magnesio.setBackground(Color.GRAY);
          calcio.setBackground(Color.GRAY);
          estroncio.setBackground(Color.GRAY);
          bario.setBackground(Color.GRAY);
          radio.setBackground(Color.GRAY);
          escandio.setBackground(Color.GRAY);
          itrio.setBackground(Color.GRAY);
          titanio.setBackground(Color.GRAY);
          zirconio.setBackground(Color.GRAY);
          hafnio.setBackground(Color.GRAY);
          vanadio.setBackground(Color.GRAY);
          niobio.setBackground(Color.GRAY);
          tantalio.setBackground(Color.GRAY);
          cromo.setBackground(Color.GRAY);
          molibdeno.setBackground(Color.GRAY);
          tungsteno.setBackground(Color.GRAY);
          manganeso.setBackground(Color.GRAY);
          renio.setBackground(Color.GRAY);
          hierro.setBackground(Color.GRAY);
          rutenio.setBackground(Color.GRAY);
          osmio.setBackground(Color.GRAY);
          cobalto.setBackground(Color.GRAY);
          rodio.setBackground(Color.GRAY);
          iridio.setBackground(Color.GRAY);
          niquel.setBackground(Color.GRAY);
          paladio.setBackground(Color.GRAY);
          platino.setBackground(Color.GRAY);
          cobre.setBackground(Color.GRAY);
          plata.setBackground(Color.GRAY);
          oro.setBackground(Color.GRAY);
          zinc.setBackground(Color.GRAY);
          cadmio.setBackground(Color.GRAY);
          aluminio.setBackground(Color.GRAY);
          galio.setBackground(Color.GRAY);
          indio.setBackground(Color.GRAY);
          talio.setBackground(Color.GRAY);
          estaño.setBackground(Color.GRAY);
          plomo.setBackground(Color.GRAY);
          bismuto.setBackground(Color.GRAY);
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          yodo.setBackground(Color.GRAY);
          astato.setBackground(Color.GRAY);
          selenio.setBackground(Color.GRAY);
          fosforo.setBackground(Color.GRAY);
          azufre.setBackground(Color.GRAY);
          carbon.setBackground(Color.GRAY);
          boro.setBackground(Color.GRAY);
          silicio.setBackground(Color.GRAY);
          germanio.setBackground(Color.GRAY);
          antimonio.setBackground(Color.GRAY);
          telurio.setBackground(Color.GRAY);
          polonio.setBackground(Color.GRAY);
          arsenico.setBackground(Color.GRAY);
          
           ruthterfordio.setBackground(Color.GRAY);
          dubnio.setBackground(Color.GRAY);
          seaborgio.setBackground(Color.GRAY);
          tecnecio.setBackground(Color.GRAY);
          bohrio.setBackground(Color.GRAY);
          hassio.setBackground(Color.GRAY);
          meitnerio.setBackground(Color.GRAY);
          darmstadtio.setBackground(Color.GRAY);
          roentgenio.setBackground(Color.GRAY);
          darwanzio.setBackground(Color.GRAY);
          tustrano.setBackground(Color.GRAY);
          erristeneo.setBackground(Color.GRAY);
          merchel.setBackground(Color.GRAY);
          nectarten.setBackground(Color.GRAY);
          efelio.setBackground(Color.GRAY);
          oberon.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
      }
        if (solido.isSelected()) {
          litio.setBackground(Color.BLUE);
          sodio.setBackground(Color.BLUE);
          potasio.setBackground(Color.BLUE);
          rubidio.setBackground(Color.BLUE);
          cesio.setBackground(Color.BLUE);
          berilio.setBackground(Color.BLUE);
          magnesio.setBackground(Color.BLUE);
          calcio.setBackground(Color.BLUE);
          estroncio.setBackground(Color.BLUE);
          bario.setBackground(Color.BLUE);
          radio.setBackground(Color.BLUE);
          escandio.setBackground(Color.BLUE);
          itrio.setBackground(Color.BLUE);
          titanio.setBackground(Color.BLUE);
          zirconio.setBackground(Color.BLUE);
          hafnio.setBackground(Color.BLUE);
          vanadio.setBackground(Color.BLUE);
          niobio.setBackground(Color.BLUE);
          tantalio.setBackground(Color.BLUE);
          cromo.setBackground(Color.BLUE);
          molibdeno.setBackground(Color.BLUE);
          tungsteno.setBackground(Color.BLUE);
          manganeso.setBackground(Color.BLUE);
          renio.setBackground(Color.BLUE);
          hierro.setBackground(Color.BLUE);
          rutenio.setBackground(Color.BLUE);
          osmio.setBackground(Color.BLUE);
          cobalto.setBackground(Color.BLUE);
          rodio.setBackground(Color.BLUE);
          iridio.setBackground(Color.BLUE);
          niquel.setBackground(Color.BLUE);
          paladio.setBackground(Color.BLUE);
          platino.setBackground(Color.BLUE);
          cobre.setBackground(Color.BLUE);
          plata.setBackground(Color.BLUE);
          oro.setBackground(Color.BLUE);
          zinc.setBackground(Color.BLUE);
          cadmio.setBackground(Color.BLUE);
          aluminio.setBackground(Color.BLUE);
          galio.setBackground(Color.BLUE);
          indio.setBackground(Color.BLUE);
          talio.setBackground(Color.BLUE);
          estaño.setBackground(Color.BLUE);
          plomo.setBackground(Color.BLUE);
          bismuto.setBackground(Color.BLUE);
          lantano.setBackground(Color.BLUE);
          cerio.setBackground(Color.BLUE);
          praseodimio.setBackground(Color.BLUE);
          neodimio.setBackground(Color.BLUE);
          samario.setBackground(Color.BLUE);
          europio.setBackground(Color.BLUE);
          gadolinio.setBackground(Color.BLUE);
          terbio.setBackground(Color.BLUE);
          disprosio.setBackground(Color.BLUE);
          holmio.setBackground(Color.BLUE);
          erbio.setBackground(Color.BLUE);
          tulio.setBackground(Color.BLUE);
          iterbio.setBackground(Color.BLUE);
          lutecio.setBackground(Color.BLUE);
          actinio.setBackground(Color.BLUE);
          torio.setBackground(Color.BLUE);
          protactinio.setBackground(Color.BLUE);
          uranio.setBackground(Color.BLUE);
          yodo.setBackground(Color.BLUE);
          astato.setBackground(Color.BLUE);
          selenio.setBackground(Color.BLUE);
          fosforo.setBackground(Color.BLUE);
          azufre.setBackground(Color.BLUE);
          carbon.setBackground(Color.BLUE);
          boro.setBackground(Color.BLUE);
          silicio.setBackground(Color.BLUE);
          germanio.setBackground(Color.BLUE);
          antimonio.setBackground(Color.BLUE);
          telurio.setBackground(Color.BLUE);
          polonio.setBackground(Color.BLUE);
          arsenico.setBackground(Color.BLUE);
          
           francio.setBackground(Color.GRAY);
          mercurio.setBackground(Color.GRAY);
          bromo.setBackground(Color.GRAY);
          
            helio.setBackground(Color.GRAY);
          neon.setBackground(Color.GRAY);
          argon.setBackground(Color.GRAY);
          kripton.setBackground(Color.GRAY);
          xenon.setBackground(Color.GRAY);
          radon.setBackground(Color.GRAY);
          hidrogeno.setBackground(Color.GRAY);
          nitrogeno.setBackground(Color.GRAY);
          oxigeno.setBackground(Color.GRAY);
          fluor.setBackground(Color.GRAY);
          cloro.setBackground(Color.GRAY);
          
             ruthterfordio.setBackground(Color.GRAY);
          dubnio.setBackground(Color.GRAY);
          seaborgio.setBackground(Color.GRAY);
          tecnecio.setBackground(Color.GRAY);
          bohrio.setBackground(Color.GRAY);
          hassio.setBackground(Color.GRAY);
          meitnerio.setBackground(Color.GRAY);
          darmstadtio.setBackground(Color.GRAY);
          roentgenio.setBackground(Color.GRAY);
          darwanzio.setBackground(Color.GRAY);
          tustrano.setBackground(Color.GRAY);
          erristeneo.setBackground(Color.GRAY);
          merchel.setBackground(Color.GRAY);
          nectarten.setBackground(Color.GRAY);
          efelio.setBackground(Color.GRAY);
          oberon.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
      }
      if(sintetico.isSelected()){
          ruthterfordio.setBackground(Color.PINK);
          dubnio.setBackground(Color.PINK);
          seaborgio.setBackground(Color.PINK);
          tecnecio.setBackground(Color.PINK);
          bohrio.setBackground(Color.PINK);
          hassio.setBackground(Color.PINK);
          meitnerio.setBackground(Color.PINK);
          darmstadtio.setBackground(Color.PINK);
          roentgenio.setBackground(Color.PINK);
          darwanzio.setBackground(Color.PINK);
          tustrano.setBackground(Color.PINK);
          erristeneo.setBackground(Color.PINK);
          merchel.setBackground(Color.PINK);
          nectarten.setBackground(Color.PINK);
          efelio.setBackground(Color.PINK);
          oberon.setBackground(Color.PINK);
          prometio.setBackground(Color.PINK);
          neptunio.setBackground(Color.PINK);
          plutonio.setBackground(Color.PINK);
          americio.setBackground(Color.PINK);
          curio.setBackground(Color.PINK);
          berkelio.setBackground(Color.PINK);
          californio.setBackground(Color.PINK);
          einstenio.setBackground(Color.PINK);
          fermio.setBackground(Color.PINK);
          mendelevio.setBackground(Color.PINK);
          nobelio.setBackground(Color.PINK);
          lawrencio.setBackground(Color.PINK);
          
           francio.setBackground(Color.GRAY);
          mercurio.setBackground(Color.GRAY);
          bromo.setBackground(Color.GRAY);
          
            helio.setBackground(Color.GRAY);
          neon.setBackground(Color.GRAY);
          argon.setBackground(Color.GRAY);
          kripton.setBackground(Color.GRAY);
          xenon.setBackground(Color.GRAY);
          radon.setBackground(Color.GRAY);
          hidrogeno.setBackground(Color.GRAY);
          nitrogeno.setBackground(Color.GRAY);
          oxigeno.setBackground(Color.GRAY);
          fluor.setBackground(Color.GRAY);
          cloro.setBackground(Color.GRAY);
          
          litio.setBackground(Color.GRAY);
          sodio.setBackground(Color.GRAY);
          potasio.setBackground(Color.GRAY);
          rubidio.setBackground(Color.GRAY);
          cesio.setBackground(Color.GRAY);
          berilio.setBackground(Color.GRAY);
          magnesio.setBackground(Color.GRAY);
          calcio.setBackground(Color.GRAY);
          estroncio.setBackground(Color.GRAY);
          bario.setBackground(Color.GRAY);
          radio.setBackground(Color.GRAY);
          escandio.setBackground(Color.GRAY);
          itrio.setBackground(Color.GRAY);
          titanio.setBackground(Color.GRAY);
          zirconio.setBackground(Color.GRAY);
          hafnio.setBackground(Color.GRAY);
          vanadio.setBackground(Color.GRAY);
          niobio.setBackground(Color.GRAY);
          tantalio.setBackground(Color.GRAY);
          cromo.setBackground(Color.GRAY);
          molibdeno.setBackground(Color.GRAY);
          tungsteno.setBackground(Color.GRAY);
          manganeso.setBackground(Color.GRAY);
          renio.setBackground(Color.GRAY);
          hierro.setBackground(Color.GRAY);
          rutenio.setBackground(Color.GRAY);
          osmio.setBackground(Color.GRAY);
          cobalto.setBackground(Color.GRAY);
          rodio.setBackground(Color.GRAY);
          iridio.setBackground(Color.GRAY);
          niquel.setBackground(Color.GRAY);
          paladio.setBackground(Color.GRAY);
          platino.setBackground(Color.GRAY);
          cobre.setBackground(Color.GRAY);
          plata.setBackground(Color.GRAY);
          oro.setBackground(Color.GRAY);
          zinc.setBackground(Color.GRAY);
          cadmio.setBackground(Color.GRAY);
          aluminio.setBackground(Color.GRAY);
          galio.setBackground(Color.GRAY);
          indio.setBackground(Color.GRAY);
          talio.setBackground(Color.GRAY);
          estaño.setBackground(Color.GRAY);
          plomo.setBackground(Color.GRAY);
          bismuto.setBackground(Color.GRAY);
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          yodo.setBackground(Color.GRAY);
          astato.setBackground(Color.GRAY);
          selenio.setBackground(Color.GRAY);
          fosforo.setBackground(Color.GRAY);
          azufre.setBackground(Color.GRAY);
          carbon.setBackground(Color.GRAY);
          boro.setBackground(Color.GRAY);
          silicio.setBackground(Color.GRAY);
          germanio.setBackground(Color.GRAY);
          antimonio.setBackground(Color.GRAY);
          telurio.setBackground(Color.GRAY);
          polonio.setBackground(Color.GRAY);
          arsenico.setBackground(Color.GRAY);
      }
      
    }//GEN-LAST:event_ver2ActionPerformed

    private void borraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraActionPerformed
       Limpiar();
       grupos.clearSelection();
    }//GEN-LAST:event_borraActionPerformed

    private void lantanioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lantanioMouseEntered
          c=2; 
        lantano.setBackground(Color.BLUE);
          cerio.setBackground(Color.BLUE);
          praseodimio.setBackground(Color.BLUE);
          neodimio.setBackground(Color.BLUE);
          prometio.setBackground(Color.BLUE);
          samario.setBackground(Color.BLUE);
          europio.setBackground(Color.BLUE);
          gadolinio.setBackground(Color.BLUE);
          terbio.setBackground(Color.BLUE);
          disprosio.setBackground(Color.BLUE);
          holmio.setBackground(Color.BLUE);
          erbio.setBackground(Color.BLUE);
          tulio.setBackground(Color.BLUE);
          iterbio.setBackground(Color.BLUE);
          lutecio.setBackground(Color.BLUE);
    }//GEN-LAST:event_lantanioMouseEntered

    private void lantanioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lantanioMouseExited

          lantano.setBackground(Color.YELLOW);
          cerio.setBackground(Color.YELLOW);
          praseodimio.setBackground(Color.YELLOW);
          neodimio.setBackground(Color.YELLOW);
          prometio.setBackground(Color.YELLOW);
          samario.setBackground(Color.YELLOW);
          europio.setBackground(Color.YELLOW);
          gadolinio.setBackground(Color.YELLOW);
          terbio.setBackground(Color.YELLOW);
          disprosio.setBackground(Color.YELLOW);
          holmio.setBackground(Color.YELLOW);
          erbio.setBackground(Color.YELLOW);
          tulio.setBackground(Color.YELLOW);
          iterbio.setBackground(Color.YELLOW);
          lutecio.setBackground(Color.YELLOW);
          if(nometales1.isSelected()){
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          }
          if(metaloides.isSelected()){
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);    
          }
          if(gas.isSelected()){
          lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          }
          if(liquido.isSelected()){
              lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          }
          if(solido.isSelected()){
          lantano.setBackground(Color.BLUE);
          cerio.setBackground(Color.BLUE);
          praseodimio.setBackground(Color.BLUE);
          neodimio.setBackground(Color.BLUE);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.BLUE);
          europio.setBackground(Color.BLUE);
          gadolinio.setBackground(Color.BLUE);
          terbio.setBackground(Color.BLUE);
          disprosio.setBackground(Color.BLUE);
          holmio.setBackground(Color.BLUE);
          erbio.setBackground(Color.BLUE);
          tulio.setBackground(Color.BLUE);
          iterbio.setBackground(Color.BLUE);
          lutecio.setBackground(Color.BLUE);
          actinio.setBackground(Color.BLUE);
          torio.setBackground(Color.BLUE);
          protactinio.setBackground(Color.BLUE);
          uranio.setBackground(Color.BLUE);
          }
          if(sintetico.isSelected()){
         lantano.setBackground(Color.GRAY);
          cerio.setBackground(Color.GRAY);
          praseodimio.setBackground(Color.GRAY);
          neodimio.setBackground(Color.GRAY);
          prometio.setBackground(Color.GRAY);
          samario.setBackground(Color.GRAY);
          europio.setBackground(Color.GRAY);
          gadolinio.setBackground(Color.GRAY);
          terbio.setBackground(Color.GRAY);
          disprosio.setBackground(Color.GRAY);
          holmio.setBackground(Color.GRAY);
          erbio.setBackground(Color.GRAY);
          tulio.setBackground(Color.GRAY);
          iterbio.setBackground(Color.GRAY);
          lutecio.setBackground(Color.GRAY);
          }
         
       
       
    }//GEN-LAST:event_lantanioMouseExited

    private void actinidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actinidosMouseEntered
        actinio.setBackground(Color.RED);
          torio.setBackground(Color.RED);
          protactinio.setBackground(Color.RED);
          uranio.setBackground(Color.RED);
          neptunio.setBackground(Color.RED);
          plutonio.setBackground(Color.RED);
          americio.setBackground(Color.RED);
          curio.setBackground(Color.RED);
          berkelio.setBackground(Color.RED);
          californio.setBackground(Color.RED);
          einstenio.setBackground(Color.RED);
          fermio.setBackground(Color.RED);
          mendelevio.setBackground(Color.RED);
          nobelio.setBackground(Color.RED);
          lawrencio.setBackground(Color.RED);
        
    }//GEN-LAST:event_actinidosMouseEntered

    private void actinidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actinidosMouseExited
        actinio.setBackground(Color.YELLOW);
          torio.setBackground(Color.YELLOW);
          protactinio.setBackground(Color.YELLOW);
          uranio.setBackground(Color.YELLOW);
          neptunio.setBackground(Color.YELLOW);
          plutonio.setBackground(Color.YELLOW);
          americio.setBackground(Color.YELLOW);
          curio.setBackground(Color.YELLOW);
          berkelio.setBackground(Color.YELLOW);
          californio.setBackground(Color.YELLOW);
          einstenio.setBackground(Color.YELLOW);
          fermio.setBackground(Color.YELLOW);
          mendelevio.setBackground(Color.YELLOW);
          nobelio.setBackground(Color.YELLOW);
          lawrencio.setBackground(Color.YELLOW);
          if(metaloides.isSelected()){
              actinio.setBackground(Color.GRAY);
              torio.setBackground(Color.GRAY);
              protactinio.setBackground(Color.GRAY);
              uranio.setBackground(Color.GRAY);
              neptunio.setBackground(Color.GRAY);
              plutonio.setBackground(Color.GRAY);
              americio.setBackground(Color.GRAY);
              curio.setBackground(Color.GRAY);
              berkelio.setBackground(Color.GRAY);
              californio.setBackground(Color.GRAY);
              einstenio.setBackground(Color.GRAY);
              fermio.setBackground(Color.GRAY);
              mendelevio.setBackground(Color.GRAY);
              nobelio.setBackground(Color.GRAY);
              lawrencio.setBackground(Color.GRAY);
          }
          if(nometales1.isSelected()){
                 actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
          }
          if(gas.isSelected()){
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
          }
          if(liquido.isSelected()){
                 actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
          }
          if(solido.isSelected()){
          actinio.setBackground(Color.BLUE);
          torio.setBackground(Color.BLUE);
          protactinio.setBackground(Color.BLUE);
          uranio.setBackground(Color.BLUE);
          neptunio.setBackground(Color.GRAY);
          plutonio.setBackground(Color.GRAY);
          americio.setBackground(Color.GRAY);
          curio.setBackground(Color.GRAY);
          berkelio.setBackground(Color.GRAY);
          californio.setBackground(Color.GRAY);
          einstenio.setBackground(Color.GRAY);
          fermio.setBackground(Color.GRAY);
          mendelevio.setBackground(Color.GRAY);
          nobelio.setBackground(Color.GRAY);
          lawrencio.setBackground(Color.GRAY);
          }
          if(sintetico.isSelected()){
          actinio.setBackground(Color.GRAY);
          torio.setBackground(Color.GRAY);
          protactinio.setBackground(Color.GRAY);
          uranio.setBackground(Color.GRAY);
          neptunio.setBackground(Color.PINK);
          plutonio.setBackground(Color.PINK);
          americio.setBackground(Color.PINK);
          curio.setBackground(Color.PINK);
          berkelio.setBackground(Color.PINK);
          californio.setBackground(Color.PINK);
          einstenio.setBackground(Color.PINK);
          fermio.setBackground(Color.PINK);
          mendelevio.setBackground(Color.PINK);
          nobelio.setBackground(Color.PINK);
          lawrencio.setBackground(Color.PINK);
          
          
          }
          
    }//GEN-LAST:event_actinidosMouseExited

    private void hidrogenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidrogenoActionPerformed
      Hidrogeno abriir = new Hidrogeno();
      abriir.setVisible(true);
    }//GEN-LAST:event_hidrogenoActionPerformed

    private void helioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helioActionPerformed
      Helio abriir = new Helio();
      abriir.setVisible(true);
    }//GEN-LAST:event_helioActionPerformed

    private void litioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_litioActionPerformed
       Litio abriir = new Litio ();
       abriir.setVisible(true);
    }//GEN-LAST:event_litioActionPerformed

    private void berilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berilioActionPerformed
        Berilio abriir = new Berilio ();
       abriir.setVisible(true);
    }//GEN-LAST:event_berilioActionPerformed

    private void boroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boroActionPerformed
      Boro abriir = new Boro ();
       abriir.setVisible(true);
    }//GEN-LAST:event_boroActionPerformed

    private void carbonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbonActionPerformed
        Carbono abriir = new Carbono();
       abriir.setVisible(true);
    }//GEN-LAST:event_carbonActionPerformed

    private void nitrogenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitrogenoActionPerformed
        Nitrogeno abriir = new Nitrogeno ();
       abriir.setVisible(true);
    }//GEN-LAST:event_nitrogenoActionPerformed

    private void oxigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxigenoActionPerformed
       Oxigeno abriir = new Oxigeno ();
       abriir.setVisible(true);  
    }//GEN-LAST:event_oxigenoActionPerformed

    private void fluorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fluorActionPerformed
        Fluor abriir = new Fluor ();
       abriir.setVisible(true);  
    }//GEN-LAST:event_fluorActionPerformed

    private void neonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neonActionPerformed
       Neon abriir = new Neon ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_neonActionPerformed

    private void sodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodioActionPerformed
        Sodio abriir = new Sodio ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_sodioActionPerformed

    private void magnesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magnesioActionPerformed
       Magnesio abriir = new Magnesio ();
       abriir.setVisible(true);
    }//GEN-LAST:event_magnesioActionPerformed

    private void aluminioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluminioActionPerformed
        Aluminio abriir = new Aluminio ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_aluminioActionPerformed

    private void silicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silicioActionPerformed
       Silicio abriir = new Silicio ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_silicioActionPerformed

    private void fosforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fosforoActionPerformed
      Fosforo abriir = new Fosforo ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_fosforoActionPerformed

    private void cloroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cloroActionPerformed
        Cloro abriir = new Cloro ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_cloroActionPerformed

    private void azufreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azufreActionPerformed
         Azufre abriir = new Azufre ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_azufreActionPerformed

    private void argonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_argonActionPerformed
        Argon abriir = new Argon ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_argonActionPerformed

    private void potasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potasioActionPerformed
        Potasio abriir = new Potasio ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_potasioActionPerformed

    private void calcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcioActionPerformed
        Calcio abriir = new Calcio ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_calcioActionPerformed

    private void escandioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escandioActionPerformed
        Escandio abriir = new Escandio ();
       abriir.setVisible(true); 
    }//GEN-LAST:event_escandioActionPerformed

    private void titanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titanioActionPerformed
        Titanio abriir = new Titanio ();
       abriir.setVisible(true);
    }//GEN-LAST:event_titanioActionPerformed

    private void vanadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanadioActionPerformed
    Vanadio abriir = new Vanadio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_vanadioActionPerformed

    private void cromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cromoActionPerformed
       Cromo abriir = new Cromo ();
     abriir.setVisible(true);
    }//GEN-LAST:event_cromoActionPerformed

    private void manganesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manganesoActionPerformed
       Manganeso abriir = new Manganeso ();
     abriir.setVisible(true);
    }//GEN-LAST:event_manganesoActionPerformed

    private void hierroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hierroActionPerformed
      Hierro abriir = new Hierro ();
     abriir.setVisible(true);
    }//GEN-LAST:event_hierroActionPerformed

    private void cobaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobaltoActionPerformed
       Cobalto abriir = new Cobalto ();
     abriir.setVisible(true);
    }//GEN-LAST:event_cobaltoActionPerformed

    private void niquelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niquelActionPerformed
       Niquel abriir = new Niquel ();
     abriir.setVisible(true); 
    }//GEN-LAST:event_niquelActionPerformed

    private void cobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobreActionPerformed
      Cobre abriir = new Cobre ();
     abriir.setVisible(true); 
    }//GEN-LAST:event_cobreActionPerformed

    private void zincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zincActionPerformed
        Zinc abriir = new Zinc ();
     abriir.setVisible(true); 
    }//GEN-LAST:event_zincActionPerformed

    private void galioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galioActionPerformed
      Galio abriir = new Galio ();
     abriir.setVisible(true); 
    }//GEN-LAST:event_galioActionPerformed

    private void germanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_germanioActionPerformed
     Germanio abriir = new Germanio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_germanioActionPerformed

    private void arsenicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsenicoActionPerformed
        Arsenico abriir = new Arsenico ();
     abriir.setVisible(true);
    }//GEN-LAST:event_arsenicoActionPerformed

    private void selenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selenioActionPerformed
     Selenio abriir = new Selenio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_selenioActionPerformed

    private void bromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bromoActionPerformed
       Bromo abriir = new Bromo ();
     abriir.setVisible(true);
    }//GEN-LAST:event_bromoActionPerformed

    private void kriptonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kriptonActionPerformed
    Kripton abriir = new Kripton ();
     abriir.setVisible(true);
    }//GEN-LAST:event_kriptonActionPerformed

    private void rubidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubidioActionPerformed
    Rubidio abriir = new Rubidio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_rubidioActionPerformed

    private void estroncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estroncioActionPerformed
      Estroncio abriir = new Estroncio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_estroncioActionPerformed

    private void itrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itrioActionPerformed
      Itrio abriir = new Itrio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_itrioActionPerformed

    private void zirconioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zirconioActionPerformed
      Zirconio abriir = new Zirconio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_zirconioActionPerformed

    private void niobioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niobioActionPerformed
     Niobio abriir = new Niobio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_niobioActionPerformed

    private void molibdenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_molibdenoActionPerformed
       Molibdeno abriir = new Molibdeno ();
     abriir.setVisible(true);
    }//GEN-LAST:event_molibdenoActionPerformed

    private void tecnecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tecnecioActionPerformed
      Tecnecio abriir = new Tecnecio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_tecnecioActionPerformed

    private void rutenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutenioActionPerformed
      Rutenio abriir = new Rutenio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_rutenioActionPerformed

    private void rodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rodioActionPerformed
      Rodio abriir = new Rodio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_rodioActionPerformed

    private void paladioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paladioActionPerformed
     Paladio abriir = new Paladio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_paladioActionPerformed

    private void plataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plataActionPerformed
       Plata abriir = new Plata ();
     abriir.setVisible(true);
    }//GEN-LAST:event_plataActionPerformed

    private void cadmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadmioActionPerformed
       Cadmio abriir = new Cadmio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_cadmioActionPerformed

    private void indioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indioActionPerformed
     Indio abriir = new Indio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_indioActionPerformed

    private void estañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estañoActionPerformed
      Estaño abriir = new Estaño ();
     abriir.setVisible(true);
    }//GEN-LAST:event_estañoActionPerformed

    private void antimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antimonioActionPerformed
     Antimonio abriir = new Antimonio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_antimonioActionPerformed

    private void telurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telurioActionPerformed
        Telurio abriir = new Telurio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_telurioActionPerformed

    private void yodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yodoActionPerformed
         Yodo abriir = new Yodo ();
     abriir.setVisible(true);
    }//GEN-LAST:event_yodoActionPerformed

    private void xenonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xenonActionPerformed
         Xenon abriir = new Xenon ();
     abriir.setVisible(true);
    }//GEN-LAST:event_xenonActionPerformed

    private void cesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cesioActionPerformed
      Cesio abriir = new Cesio ();
     abriir.setVisible(true);
    }//GEN-LAST:event_cesioActionPerformed

    private void barioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barioActionPerformed
    Bario abriir = new Bario ();
    abriir.setVisible(true);
    }//GEN-LAST:event_barioActionPerformed

    private void hafnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hafnioActionPerformed
     Hafnio abriir = new Hafnio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_hafnioActionPerformed

    private void tantalioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tantalioActionPerformed
     Tantalio abriir = new Tantalio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_tantalioActionPerformed

    private void tungstenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tungstenoActionPerformed
       Tungsteno abriir = new Tungsteno ();
    abriir.setVisible(true);
    }//GEN-LAST:event_tungstenoActionPerformed

    private void renioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renioActionPerformed
    Renio abriir = new Renio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_renioActionPerformed

    private void osmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osmioActionPerformed
      Osmio abriir = new Osmio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_osmioActionPerformed

    private void iridioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iridioActionPerformed
      Iridio abriir = new Iridio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_iridioActionPerformed

    private void platinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platinoActionPerformed
      Platino abriir = new Platino ();
    abriir.setVisible(true);
    }//GEN-LAST:event_platinoActionPerformed

    private void oroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oroActionPerformed
     Oro abriir = new Oro ();
    abriir.setVisible(true);
    }//GEN-LAST:event_oroActionPerformed

    private void mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioActionPerformed
      Mercurio abriir = new Mercurio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_mercurioActionPerformed

    private void talioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talioActionPerformed
    Talio abriir = new Talio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_talioActionPerformed

    private void plomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plomoActionPerformed
    Plomo abriir = new Plomo ();
    abriir.setVisible(true);
    }//GEN-LAST:event_plomoActionPerformed

    private void bismutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bismutoActionPerformed
    Bismuto abriir = new Bismuto ();
    abriir.setVisible(true);
    }//GEN-LAST:event_bismutoActionPerformed

    private void polonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polonioActionPerformed
    Polonio abriir = new Polonio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_polonioActionPerformed

    private void astatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astatoActionPerformed
      Astato abriir = new Astato ();
    abriir.setVisible(true);
    }//GEN-LAST:event_astatoActionPerformed

    private void radonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radonActionPerformed
     Radon abriir = new Radon ();
    abriir.setVisible(true);
    }//GEN-LAST:event_radonActionPerformed

    private void francioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_francioActionPerformed
     Francio abriir = new Francio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_francioActionPerformed

    private void radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActionPerformed
      Radio abriir = new Radio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_radioActionPerformed

    private void ruthterfordioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruthterfordioActionPerformed
        Rutherfordio abriir = new  Rutherfordio ();
    abriir.setVisible(true); 
    }//GEN-LAST:event_ruthterfordioActionPerformed

    private void dubnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubnioActionPerformed
     Dubnio abriir = new  Dubnio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_dubnioActionPerformed

    private void seaborgioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaborgioActionPerformed
      Seaborgio abriir = new Seaborgio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_seaborgioActionPerformed

    private void bohrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bohrioActionPerformed
    Bohrio abriir = new Bohrio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_bohrioActionPerformed

    private void hassioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hassioActionPerformed
     Hassio abriir = new Hassio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_hassioActionPerformed

    private void meitnerioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meitnerioActionPerformed
      Meitnerio  abriir = new Meitnerio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_meitnerioActionPerformed

    private void darmstadtioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darmstadtioActionPerformed
     Darmstadtio  abriir = new Darmstadtio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_darmstadtioActionPerformed

    private void roentgenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roentgenioActionPerformed
    Roentgenio  abriir = new Roentgenio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_roentgenioActionPerformed

    private void darwanzioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darwanzioActionPerformed
    Darwanzio  abriir = new Darwanzio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_darwanzioActionPerformed

    private void tustranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tustranoActionPerformed
    Tustrano  abriir = new Tustrano ();
    abriir.setVisible(true);
    }//GEN-LAST:event_tustranoActionPerformed

    private void erristeneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erristeneoActionPerformed
     Flerovium  abriir = new Flerovium ();
    abriir.setVisible(true);
    }//GEN-LAST:event_erristeneoActionPerformed

    private void merchelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merchelActionPerformed
     Moscovium  abriir = new Moscovium ();
    abriir.setVisible(true);
    }//GEN-LAST:event_merchelActionPerformed

    private void nectartenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nectartenActionPerformed
     Efelio  abriir = new Efelio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_nectartenActionPerformed

    private void efelioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efelioActionPerformed
     Efelioo  abriir = new Efelioo  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_efelioActionPerformed

    private void oberonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oberonActionPerformed
     Oberon  abriir = new Oberon  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_oberonActionPerformed

    private void lantanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lantanoActionPerformed
     Lantano  abriir = new Lantano  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_lantanoActionPerformed

    private void cerioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerioActionPerformed
    Cerio  abriir = new Cerio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_cerioActionPerformed

    private void praseodimioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_praseodimioActionPerformed
    Praseodimio  abriir = new Praseodimio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_praseodimioActionPerformed

    private void neodimioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neodimioActionPerformed
     Neodimio  abriir = new Neodimio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_neodimioActionPerformed

    private void prometioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prometioActionPerformed
    Prometio  abriir = new Prometio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_prometioActionPerformed

    private void samarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samarioActionPerformed
    Samario  abriir = new Samario  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_samarioActionPerformed

    private void europioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_europioActionPerformed
    Europio abriir = new Europio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_europioActionPerformed

    private void gadolinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gadolinioActionPerformed
     Gadolinio abriir = new Gadolinio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_gadolinioActionPerformed

    private void terbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terbioActionPerformed
    Terbio abriir = new Terbio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_terbioActionPerformed

    private void disprosioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disprosioActionPerformed
    Disprosio abriir = new Disprosio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_disprosioActionPerformed

    private void holmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holmioActionPerformed
    Holmio abriir = new Holmio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_holmioActionPerformed

    private void erbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erbioActionPerformed
     Erbio abriir = new Erbio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_erbioActionPerformed

    private void tulioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tulioActionPerformed
     Tulio abriir = new Tulio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_tulioActionPerformed

    private void iterbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iterbioActionPerformed
     Iterbio abriir = new Iterbio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_iterbioActionPerformed

    private void lutecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lutecioActionPerformed
     Lutecio abriir = new Lutecio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_lutecioActionPerformed

    private void actinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actinioActionPerformed
     Actinio abriir = new Actinio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_actinioActionPerformed

    private void torioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torioActionPerformed
     Torio abriir = new Torio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_torioActionPerformed

    private void protactinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protactinioActionPerformed
    Protactinio abriir = new Protactinio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_protactinioActionPerformed

    private void uranioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranioActionPerformed
    Uranio abriir = new Uranio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_uranioActionPerformed

    private void neptunioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neptunioActionPerformed
    Neptunio abriir = new Neptunio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_neptunioActionPerformed

    private void plutonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plutonioActionPerformed
     Plutonio abriir = new Plutonio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_plutonioActionPerformed

    private void americioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americioActionPerformed
    Americio abriir = new Americio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_americioActionPerformed

    private void curioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curioActionPerformed
     curio abriir = new curio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_curioActionPerformed

    private void berkelioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berkelioActionPerformed
     berkelio abriir = new berkelio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_berkelioActionPerformed

    private void californioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_californioActionPerformed
    californio abriir = new californio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_californioActionPerformed

    private void einstenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_einstenioActionPerformed
        einstenio abriir = new einstenio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_einstenioActionPerformed

    private void fermioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermioActionPerformed
      fermio abriir = new fermio  ();
    abriir.setVisible(true);
    }//GEN-LAST:event_fermioActionPerformed

    private void mendelevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mendelevioActionPerformed
      mendelevio abriir = new mendelevio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_mendelevioActionPerformed

    private void nobelioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nobelioActionPerformed
    nobelio abriir = new nobelio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_nobelioActionPerformed

    private void lawrencioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lawrencioActionPerformed
    lawrencio abriir = new lawrencio ();
    abriir.setVisible(true);
    }//GEN-LAST:event_lawrencioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    INICIO abriir = new INICIO ();
    abriir.setVisible(true); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TABLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TABLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TABLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TABLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TABLA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actinidos;
    private javax.swing.JButton actinio;
    private javax.swing.JButton aluminio;
    private javax.swing.JButton americio;
    private javax.swing.JButton antimonio;
    private javax.swing.JButton argon;
    private javax.swing.JButton arsenico;
    private javax.swing.JButton astato;
    private javax.swing.JButton azufre;
    private javax.swing.JButton bario;
    private javax.swing.JButton berilio;
    private javax.swing.JButton berkelio;
    private javax.swing.JButton bismuto;
    private javax.swing.JButton bohrio;
    private javax.swing.JButton boro;
    private javax.swing.JButton borra;
    private javax.swing.JButton bromo;
    private javax.swing.JButton cadmio;
    private javax.swing.JButton calcio;
    private javax.swing.JButton californio;
    private javax.swing.JButton carbon;
    private javax.swing.JButton cerio;
    private javax.swing.JButton cesio;
    private javax.swing.JButton cloro;
    private javax.swing.JButton cobalto;
    private javax.swing.JButton cobre;
    private javax.swing.JButton cromo;
    private javax.swing.JButton curio;
    private javax.swing.JButton darmstadtio;
    private javax.swing.JButton darwanzio;
    private javax.swing.JButton disprosio;
    private javax.swing.JButton dubnio;
    private javax.swing.JButton efelio;
    private javax.swing.JButton einstenio;
    private javax.swing.JButton erbio;
    private javax.swing.JButton erristeneo;
    private javax.swing.JButton escandio;
    private javax.swing.JButton estaño;
    private javax.swing.JButton estroncio;
    private javax.swing.JButton europio;
    private javax.swing.JButton fermio;
    private javax.swing.JButton fluor;
    private javax.swing.JButton fosforo;
    private javax.swing.JButton francio;
    private javax.swing.JButton gadolinio;
    private javax.swing.JButton galio;
    private javax.swing.JCheckBox gas;
    private javax.swing.JButton germanio;
    private javax.swing.ButtonGroup grupos;
    private javax.swing.JButton hafnio;
    private javax.swing.JButton hassio;
    private javax.swing.JButton helio;
    private javax.swing.JButton hidrogeno;
    private javax.swing.JButton hierro;
    private javax.swing.JButton holmio;
    private javax.swing.JButton indio;
    private javax.swing.JButton iridio;
    private javax.swing.JButton iterbio;
    private javax.swing.JButton itrio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kripton;
    private javax.swing.JButton lantanio;
    private javax.swing.JButton lantano;
    private javax.swing.JButton lawrencio;
    private javax.swing.JCheckBox liquido;
    private javax.swing.JButton litio;
    private javax.swing.JButton lutecio;
    private javax.swing.JButton magnesio;
    private javax.swing.JButton manganeso;
    private javax.swing.JButton meitnerio;
    private javax.swing.JButton mendelevio;
    private javax.swing.JButton merchel;
    private javax.swing.JButton mercurio;
    private javax.swing.JCheckBox metales1;
    private javax.swing.JCheckBox metaloides;
    private javax.swing.JButton molibdeno;
    private javax.swing.JButton nectarten;
    private javax.swing.JButton neodimio;
    private javax.swing.JButton neon;
    private javax.swing.JButton neptunio;
    private javax.swing.JButton niobio;
    private javax.swing.JButton niquel;
    private javax.swing.JButton nitrogeno;
    private javax.swing.JButton nobelio;
    private javax.swing.JCheckBox nometales1;
    private javax.swing.JButton oberon;
    private javax.swing.JButton oro;
    private javax.swing.JButton osmio;
    private javax.swing.JButton oxigeno;
    private javax.swing.JButton paladio;
    private javax.swing.JButton plata;
    private javax.swing.JButton platino;
    private javax.swing.JButton plomo;
    private javax.swing.JButton plutonio;
    private javax.swing.JButton polonio;
    private javax.swing.JButton potasio;
    private javax.swing.JButton praseodimio;
    private javax.swing.JButton prometio;
    private javax.swing.JButton protactinio;
    private javax.swing.JButton radio;
    private javax.swing.JButton radon;
    private javax.swing.JButton renio;
    private javax.swing.JButton rodio;
    private javax.swing.JButton roentgenio;
    private javax.swing.JButton rubidio;
    private javax.swing.JButton rutenio;
    private javax.swing.JButton ruthterfordio;
    private javax.swing.JButton samario;
    private javax.swing.JButton seaborgio;
    private javax.swing.JButton selenio;
    private javax.swing.JButton silicio;
    private javax.swing.JCheckBox sintetico;
    private javax.swing.JButton sodio;
    private javax.swing.JCheckBox solido;
    private javax.swing.JButton talio;
    private javax.swing.JButton tantalio;
    private javax.swing.JButton tecnecio;
    private javax.swing.JButton telurio;
    private javax.swing.JButton terbio;
    private javax.swing.JButton titanio;
    private javax.swing.JButton torio;
    private javax.swing.JButton tulio;
    private javax.swing.JButton tungsteno;
    private javax.swing.JButton tustrano;
    private javax.swing.JButton uranio;
    private javax.swing.JButton vanadio;
    private javax.swing.JButton ver2;
    private javax.swing.JButton xenon;
    private javax.swing.JButton yodo;
    private javax.swing.JButton zinc;
    private javax.swing.JButton zirconio;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        
carbon.setBackground(Color.GREEN);
          nitrogeno.setBackground(Color.GREEN);
          oxigeno.setBackground(Color.GREEN);
          fluor.setBackground(Color.GREEN);
          helio.setBackground(Color.GREEN);
          neon.setBackground(Color.GREEN);
          argon.setBackground(Color.GREEN);
          kripton.setBackground(Color.GREEN);
          xenon.setBackground(Color.GREEN);
          radon.setBackground(Color.GREEN);
          fosforo.setBackground(Color.GREEN);
          azufre.setBackground(Color.GREEN);
          cloro.setBackground(Color.GREEN);
          selenio.setBackground(Color.GREEN);
          bromo.setBackground(Color.GREEN);
          yodo.setBackground(Color.GREEN);
          astato.setBackground(Color.GREEN);
          hidrogeno.setBackground(Color.GREEN);
          boro.setBackground(Color.RED);
          silicio.setBackground(Color.RED);
          germanio.setBackground(Color.RED);
          antimonio.setBackground(Color.RED);
          telurio.setBackground(Color.RED);
          polonio.setBackground(Color.RED);
          arsenico.setBackground(Color.RED);
          arsenico.setBackground(Color.RED);
          litio.setBackground(Color.YELLOW);
          sodio.setBackground(Color.YELLOW);
          potasio.setBackground(Color.YELLOW);
          rubidio.setBackground(Color.YELLOW);
          cesio.setBackground(Color.YELLOW);
          francio.setBackground(Color.YELLOW);
          berilio.setBackground(Color.YELLOW);
          magnesio.setBackground(Color.YELLOW);
          calcio.setBackground(Color.YELLOW);
          estroncio.setBackground(Color.YELLOW);
          bario.setBackground(Color.YELLOW);
          radio.setBackground(Color.YELLOW);
          escandio.setBackground(Color.YELLOW);
          itrio.setBackground(Color.YELLOW);
          titanio.setBackground(Color.YELLOW);
          zirconio.setBackground(Color.YELLOW);
          hafnio.setBackground(Color.YELLOW);
          ruthterfordio.setBackground(Color.YELLOW);
          vanadio.setBackground(Color.YELLOW);
          niobio.setBackground(Color.YELLOW);
          tantalio.setBackground(Color.YELLOW);
          dubnio.setBackground(Color.YELLOW);
          cromo.setBackground(Color.YELLOW);
          molibdeno.setBackground(Color.YELLOW);
          tungsteno.setBackground(Color.YELLOW);
          seaborgio.setBackground(Color.YELLOW);
          manganeso.setBackground(Color.YELLOW);
          tecnecio.setBackground(Color.YELLOW);
          renio.setBackground(Color.YELLOW);
          bohrio.setBackground(Color.YELLOW);
          hierro.setBackground(Color.YELLOW);
          rutenio.setBackground(Color.YELLOW);
          osmio.setBackground(Color.YELLOW);
          hassio.setBackground(Color.YELLOW);
          cobalto.setBackground(Color.YELLOW);
          rodio.setBackground(Color.YELLOW);
          iridio.setBackground(Color.YELLOW);
          meitnerio.setBackground(Color.YELLOW);
          niquel.setBackground(Color.YELLOW);
          paladio.setBackground(Color.YELLOW);
          platino.setBackground(Color.YELLOW);
          darmstadtio.setBackground(Color.YELLOW);
          cobre.setBackground(Color.YELLOW);
          plata.setBackground(Color.YELLOW);
          oro.setBackground(Color.YELLOW);
          roentgenio.setBackground(Color.YELLOW);
          zinc.setBackground(Color.YELLOW);
          cadmio.setBackground(Color.YELLOW);
          mercurio.setBackground(Color.YELLOW);
          darwanzio.setBackground(Color.YELLOW);
          aluminio.setBackground(Color.YELLOW);
          galio.setBackground(Color.YELLOW);
          indio.setBackground(Color.YELLOW);
          talio.setBackground(Color.YELLOW);
          tustrano.setBackground(Color.YELLOW);
          estaño.setBackground(Color.YELLOW);
          plomo.setBackground(Color.YELLOW);
          erristeneo.setBackground(Color.YELLOW);
          bismuto.setBackground(Color.YELLOW);
          merchel.setBackground(Color.YELLOW);
          nectarten.setBackground(Color.YELLOW);
          efelio.setBackground(Color.YELLOW);
          oberon.setBackground(Color.YELLOW);
          lantano.setBackground(Color.YELLOW);
          cerio.setBackground(Color.YELLOW);
          praseodimio.setBackground(Color.YELLOW);
          neodimio.setBackground(Color.YELLOW);
          prometio.setBackground(Color.YELLOW);
          samario.setBackground(Color.YELLOW);
          europio.setBackground(Color.YELLOW);
          gadolinio.setBackground(Color.YELLOW);
          terbio.setBackground(Color.YELLOW);
          disprosio.setBackground(Color.YELLOW);
          holmio.setBackground(Color.YELLOW);
          erbio.setBackground(Color.YELLOW);
          tulio.setBackground(Color.YELLOW);
          iterbio.setBackground(Color.YELLOW);
          lutecio.setBackground(Color.YELLOW);
          actinio.setBackground(Color.YELLOW);
          torio.setBackground(Color.YELLOW);
          protactinio.setBackground(Color.YELLOW);
          uranio.setBackground(Color.YELLOW);
          neptunio.setBackground(Color.YELLOW);
          plutonio.setBackground(Color.YELLOW);
          americio.setBackground(Color.YELLOW);
          curio.setBackground(Color.YELLOW);
          berkelio.setBackground(Color.YELLOW);
          californio.setBackground(Color.YELLOW);
          einstenio.setBackground(Color.YELLOW);
          fermio.setBackground(Color.YELLOW);
          mendelevio.setBackground(Color.YELLOW);
          nobelio.setBackground(Color.YELLOW);
          lawrencio.setBackground(Color.YELLOW);
//           lantanio.setBackground(Color.YELLOW);
//          actinidos.setBackground(Color.YELLOW);
    }
    
     class imagenfondo extends JPanel{
        private Image imagen;
        public void paint (Graphics g){
             imagen = new ImageIcon(getClass().getResource("19366.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
}
}
