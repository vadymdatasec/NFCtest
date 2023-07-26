public class c.l.d.w extends c.l.d.n0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final androidx.fragment.app.Fragment a; //synthetic
	 /* # direct methods */
	 public c.l.d.w ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Lc/l/d/n0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = this.I;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.view.View ) v0 ).findViewById ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalStateException; */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Fragment "; // const-string v1, "Fragment "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.a;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = " does not have a view"; // const-string v1, " does not have a view"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 1 */
		 /* .line 4 */
		 v0 = this.a;
		 v0 = this.I;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // .end method
