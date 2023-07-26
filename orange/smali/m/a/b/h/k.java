public class m.a.b.h.k extends javax.swing.AbstractAction {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final m.a.b.h.k a;
	 public static java.lang.Class b; //synthetic
	 /* # direct methods */
	 public static m.a.b.h.k ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = m.a.b.h.k.b;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.chainsaw.ExitAction"; // const-string v0, "org.apache.log4j.chainsaw.ExitAction"
		 m.a.b.h.k .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 /* .line 2 */
	 /* new-instance v0, Lm/a/b/h/k; */
	 /* invoke-direct {v0}, Lm/a/b/h/k;-><init>()V */
	 return;
} // .end method
public m.a.b.h.k ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljavax/swing/AbstractAction;-><init>()V */
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
