public class inal extends java.lang.InheritableThreadLocal {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/InheritableThreadLocal;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.Object childValue ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* check-cast p1, Ljava/util/Hashtable; */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 (( java.util.Hashtable ) p1 ).clone ( ); // invoke-virtual {p1}, Ljava/util/Hashtable;->clone()Ljava/lang/Object;
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
