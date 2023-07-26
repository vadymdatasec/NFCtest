public class m.a.b.h.l extends javax.swing.AbstractAction {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Class d; //synthetic
	 /* # instance fields */
	 public final javax.swing.JFileChooser a;
	 public final org.xml.sax.XMLReader b;
	 public final m.a.b.h.s c;
	 /* # direct methods */
	 public static m.a.b.h.l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = m.a.b.h.l.d;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.chainsaw.LoadXMLAction"; // const-string v0, "org.apache.log4j.chainsaw.LoadXMLAction"
		 m.a.b.h.l .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public m.a.b.h.l ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/xml/sax/SAXException;, */
	 /* Ljavax/xml/parsers/ParserConfigurationException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljavax/swing/AbstractAction;-><init>()V */
/* .line 2 */
/* new-instance p1, Ljavax/swing/JFileChooser; */
/* invoke-direct {p1}, Ljavax/swing/JFileChooser;-><init>()V */
this.a = p1;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( javax.swing.JFileChooser ) p1 ).setMultiSelectionEnabled ( v0 ); // invoke-virtual {p1, v0}, Ljavax/swing/JFileChooser;->setMultiSelectionEnabled(Z)V
/* .line 4 */
p1 = this.a;
(( javax.swing.JFileChooser ) p1 ).setFileSelectionMode ( v0 ); // invoke-virtual {p1, v0}, Ljavax/swing/JFileChooser;->setFileSelectionMode(I)V
/* .line 5 */
/* new-instance p1, Lm/a/b/h/s; */
/* invoke-direct {p1, p2}, Lm/a/b/h/s;-><init>(Lm/a/b/h/r;)V */
this.c = p1;
/* .line 6 */
javax.xml.parsers.SAXParserFactory .newInstance ( );
(( javax.xml.parsers.SAXParserFactory ) p1 ).newSAXParser ( ); // invoke-virtual {p1}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
(( javax.xml.parsers.SAXParser ) p1 ).getXMLReader ( ); // invoke-virtual {p1}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
this.b = p1;
/* .line 7 */
p2 = this.c;
return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
/* .locals 1 */
/* .line 1 */
try { // :try_start_0
	 java.lang.Class .forName ( p0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p0 */
	 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
	 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
	 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
	 /* throw p0 */
} // .end method
