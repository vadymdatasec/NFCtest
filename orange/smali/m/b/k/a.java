public class m.b.k.a implements m.b.k.s0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final m.b.i.l a;
	 public final m.b.k.f b;
	 public final m.b.k.q0 c;
	 /* # direct methods */
	 public m.b.k.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, Integer p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void b ( Object p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* instance-of p2, p1, Lm/b/i/l; */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Lm/b/i/l; */
			 /* .line 3 */
			 p2 = this.c;
			 v0 = this.a;
			 p2 = 			 (( m.b.k.q0 ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 4 */
				 p2 = this.b;
				 (( java.util.ArrayList ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
			 } // :cond_0
			 return;
		 } // .end method
