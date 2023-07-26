public class c.h.n.b1 implements c.h.n.d1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.h.n.c1 a;
	 public Boolean b;
	 /* # direct methods */
	 public c.h.n.b1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0 ) {
		 /* .locals 3 */
		 /* .annotation build Landroid/annotation/SuppressLint; */
		 /* value = { */
		 /* "WrongConstant" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 /* iget v0, v0, Lc/h/n/c1;->d:I */
	 int v1 = -1; // const/4 v1, -0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-le v0, v1, :cond_0 */
	 /* .line 2 */
	 (( android.view.View ) p1 ).setLayerType ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
	 /* .line 3 */
	 v0 = this.a;
	 /* iput v1, v0, Lc/h/n/c1;->d:I */
	 /* .line 4 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-ge v0, v1, :cond_1 */
/* iget-boolean v0, p0, Lc/h/n/b1;->b:Z */
/* if-nez v0, :cond_5 */
/* .line 5 */
} // :cond_1
v0 = this.a;
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 6 */
this.c = v2;
/* .line 7 */
} // :cond_2
/* const/high16 v0, 0x7e000000 */
/* .line 8 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* .line 9 */
/* instance-of v1, v0, Lc/h/n/d1; */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 10 */
/* move-object v2, v0 */
/* check-cast v2, Lc/h/n/d1; */
} // :cond_3
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 11 */
} // :cond_4
int p1 = 1; // const/4 p1, 0x1
/* .line 12 */
/* iput-boolean p1, p0, Lc/h/n/b1;->b:Z */
} // :cond_5
return;
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Lc/h/n/b1;->b:Z */
/* .line 2 */
v0 = this.a;
/* iget v0, v0, Lc/h/n/c1;->d:I */
int v1 = 0; // const/4 v1, 0x0
int v2 = -1; // const/4 v2, -0x1
/* if-le v0, v2, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* .line 3 */
(( android.view.View ) p1 ).setLayerType ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
/* .line 4 */
} // :cond_0
v0 = this.a;
v2 = this.b;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
this.b = v1;
/* .line 6 */
} // :cond_1
/* const/high16 v0, 0x7e000000 */
/* .line 7 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* .line 8 */
/* instance-of v2, v0, Lc/h/n/d1; */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 9 */
/* move-object v1, v0 */
/* check-cast v1, Lc/h/n/d1; */
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 10 */
} // :cond_3
return;
} // .end method
public void c ( android.view.View p0 ) {
/* .locals 2 */
/* const/high16 v0, 0x7e000000 */
/* .line 1 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* .line 2 */
/* instance-of v1, v0, Lc/h/n/d1; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* check-cast v0, Lc/h/n/d1; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
return;
} // .end method
