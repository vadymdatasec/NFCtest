public class c.l.d.m1 implements c.l.d.l1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final Integer b;
	 public final Integer c;
	 public final c.l.d.o1 d; //synthetic
	 /* # direct methods */
	 public c.l.d.m1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 /* .line 3 */
		 /* iput p3, p0, Lc/l/d/m1;->b:I */
		 /* .line 4 */
		 /* iput p4, p0, Lc/l/d/m1;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( java.util.ArrayList p0, java.util.ArrayList p1 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/ArrayList<", */
		 /* "Lc/l/d/a;", */
		 /* ">;", */
		 /* "Ljava/util/ArrayList<", */
		 /* "Ljava/lang/Boolean;", */
		 /* ">;)Z" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.d;
	 v0 = this.u;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget v1, p0, Lc/l/d/m1;->b:I */
		 /* if-gez v1, :cond_0 */
		 v1 = this.a;
		 /* if-nez v1, :cond_0 */
		 /* .line 2 */
		 (( androidx.fragment.app.Fragment ) v0 ).l ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;
		 /* .line 3 */
		 v0 = 		 (( c.l.d.o1 ) v0 ).K ( ); // invoke-virtual {v0}, Lc/l/d/o1;->K()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.d;
		 v3 = this.a;
		 /* iget v4, p0, Lc/l/d/m1;->b:I */
		 /* iget v5, p0, Lc/l/d/m1;->c:I */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 p1 = 		 /* invoke-virtual/range {v0 ..v5}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z */
	 } // .end method
