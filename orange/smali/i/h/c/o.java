public class i.h.c.o {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public i.h.c.o ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public i.j.b a ( java.lang.Class p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Li/h/c/e; */
		 /* invoke-direct {v0, p1}, Li/h/c/e;-><init>(Ljava/lang/Class;)V */
	 } // .end method
	 public i.j.c a ( java.lang.Class p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Li/h/c/m; */
		 /* invoke-direct {v0, p1, p2}, Li/h/c/m;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
	 } // .end method
	 public i.j.d a ( Object p0 ) {
		 /* .locals 0 */
	 } // .end method
	 public java.lang.String a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) p1 ).getGenericInterfaces ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget-object p1, p1, v0 */
		 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 final String v0 = "kotlin.jvm.functions."; // const-string v0, "kotlin.jvm.functions."
		 /* .line 5 */
		 v0 = 		 (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* const/16 v0, 0x15 */
			 (( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
		 } // :cond_0
	 } // .end method
	 public java.lang.String a ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 (( i.h.c.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Li/h/c/o;->a(Li/h/c/h;)Ljava/lang/String;
	 } // .end method
