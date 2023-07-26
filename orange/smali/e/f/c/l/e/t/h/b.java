public class e.f.c.l.e.t.h.b implements e.f.c.l.e.t.h.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.c.l.e.t.h.d a;
	 public final e.f.c.l.e.t.h.e b;
	 /* # direct methods */
	 public e.f.c.l.e.t.h.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Object p0, Boolean p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = e.f.c.l.e.t.h.a.a;
		 v1 = this.c;
		 v1 = 		 (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
		 /* aget v0, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-eq v0, v1, :cond_1 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* if-eq v0, v2, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
	 } // :cond_0
	 v0 = this.b;
	 (( e.f.c.l.e.t.h.e ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/c/l/e/t/h/e;->a(Le/f/c/l/e/t/g/a;Z)Z
	 /* .line 3 */
} // :cond_1
v0 = this.a;
(( e.f.c.l.e.t.h.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/c/l/e/t/h/d;->a(Le/f/c/l/e/t/g/a;Z)Z
} // .end method
