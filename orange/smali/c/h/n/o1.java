public class c.h.n.o1 extends c.h.n.n1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.h.n.o1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/n/n1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V */
		 return;
	 } // .end method
	 public c.h.n.o1 ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/n/n1;-><init>(Lc/h/n/u1;Lc/h/n/n1;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.h.n.u1 a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 (( android.view.WindowInsets ) v0 ).consumeDisplayCutout ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;
		 c.h.n.u1 .a ( v0 );
	 } // .end method
	 public c.h.n.h d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 (( android.view.WindowInsets ) v0 ).getDisplayCutout ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;
		 c.h.n.h .a ( v0 );
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p0, p1, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* instance-of v1, p1, Lc/h/n/o1; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-nez v1, :cond_1 */
	 /* .line 2 */
} // :cond_1
/* check-cast p1, Lc/h/n/o1; */
/* .line 3 */
v1 = this.c;
v3 = this.c;
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_2
	 v1 = this.g;
	 p1 = this.g;
	 /* .line 4 */
	 p1 = 	 java.util.Objects .equals ( v1,p1 );
	 if ( p1 != null) { // if-eqz p1, :cond_2
	 } // :cond_2
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = (( android.view.WindowInsets ) v0 ).hashCode ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I
} // .end method
