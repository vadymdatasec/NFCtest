public class e.h.b.a.l.b1 extends c.l.d.b2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public androidx.fragment.app.Fragment h;
	 /* # direct methods */
	 public e.h.b.a.l.b1 ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lc/l/d/b2;-><init>(Lc/l/d/o1;I)V */
		 /* .line 2 */
		 (( androidx.fragment.app.Fragment ) p2 ).clone ( ); // invoke-virtual {p2}, [Landroidx/fragment/app/Fragment;->clone()Ljava/lang/Object;
		 /* check-cast p1, [Landroidx/fragment/app/Fragment; */
		 this.h = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.h;
		 /* array-length v0, v0 */
	 } // .end method
	 public androidx.fragment.app.Fragment b ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 (( e.h.b.a.l.b1 ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/l/b1;->a()I
		 /* if-ge p1, v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.h;
		 /* aget-object p1, v0, p1 */
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
