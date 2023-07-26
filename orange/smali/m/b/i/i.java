public class m.b.i.i extends m.b.i.l {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public m.b.i.g i;
	 public m.b.i.h j;
	 /* # direct methods */
	 public m.b.i.i ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = m.b.j.e0.c;
		 final String v1 = "#root"; // const-string v1, "#root"
		 m.b.j.g0 .a ( v1,v0 );
		 /* invoke-direct {p0, v0, p1}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;)V */
		 /* .line 2 */
		 /* new-instance p1, Lm/b/i/g; */
		 /* invoke-direct {p1}, Lm/b/i/g;-><init>()V */
		 this.i = p1;
		 /* .line 3 */
		 p1 = m.b.i.h.b;
		 this.j = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public m.b.i.g E ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.i;
	 } // .end method
	 public m.b.i.h F ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.j;
	 } // .end method
	 public m.b.i.i a ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.j = p1;
	 } // .end method
	 public java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/CloneNotSupportedException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( m.b.i.i ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/i;->clone()Lm/b/i/i;
} // .end method
public m.b.i.i clone ( ) {
	 /* .locals 2 */
	 /* .line 4 */
	 /* invoke-super {p0}, Lm/b/i/l;->clone()Lm/b/i/l; */
	 /* check-cast v0, Lm/b/i/i; */
	 /* .line 5 */
	 v1 = this.i;
	 (( m.b.i.g ) v1 ).clone ( ); // invoke-virtual {v1}, Lm/b/i/g;->clone()Lm/b/i/g;
	 this.i = v1;
} // .end method
public m.b.i.l clone ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 2 */
	 (( m.b.i.i ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/i;->clone()Lm/b/i/i;
} // .end method
public m.b.i.t clone ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 3 */
	 (( m.b.i.i ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/i;->clone()Lm/b/i/i;
} // .end method
public java.lang.String i ( ) {
	 /* .locals 1 */
	 final String v0 = "#document"; // const-string v0, "#document"
} // .end method
public java.lang.String j ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0}, Lm/b/i/l;->v()Ljava/lang/String; */
} // .end method
