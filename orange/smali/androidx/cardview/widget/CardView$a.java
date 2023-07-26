public class androidx.cardview.widget.CardView$a implements c.d.f.f {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/cardview/widget/CardView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public android.graphics.drawable.Drawable a;
public final androidx.cardview.widget.CardView b; //synthetic
/* # direct methods */
public androidx.cardview.widget.CardView$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public android.view.View a ( ) {
/* .locals 1 */
/* .line 9 */
v0 = this.b;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.b;
/* iget v1, v0, Landroidx/cardview/widget/CardView;->d:I */
/* if-le p1, v1, :cond_0 */
/* .line 6 */
androidx.cardview.widget.CardView .a ( v0,p1 );
/* .line 7 */
} // :cond_0
p1 = this.b;
/* iget v0, p1, Landroidx/cardview/widget/CardView;->e:I */
/* if-le p2, v0, :cond_1 */
/* .line 8 */
androidx.cardview.widget.CardView .b ( p1,p2 );
} // :cond_1
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .line 3 */
v0 = this.b;
v0 = this.g;
(( android.graphics.Rect ) v0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V
/* .line 4 */
v0 = this.b;
v1 = this.f;
/* iget v2, v1, Landroid/graphics/Rect;->left:I */
/* add-int/2addr p1, v2 */
/* iget v2, v1, Landroid/graphics/Rect;->top:I */
/* add-int/2addr p2, v2 */
/* iget v2, v1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr p3, v2 */
/* iget v1, v1, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr p4, v1 */
androidx.cardview.widget.CardView .a ( v0,p1,p2,p3,p4 );
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
this.a = p1;
/* .line 2 */
v0 = this.b;
(( android.widget.FrameLayout ) v0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( androidx.cardview.widget.CardView ) v0 ).getUseCompatPadding ( ); // invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z
} // .end method
public android.graphics.drawable.Drawable c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( androidx.cardview.widget.CardView ) v0 ).getPreventCornerOverlap ( ); // invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z
} // .end method
