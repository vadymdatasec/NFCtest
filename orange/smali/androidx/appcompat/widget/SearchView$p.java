public class androidx.appcompat.widget.SearchView$p extends android.view.TouchDelegate {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "p" */
} // .end annotation
/* # instance fields */
public final android.view.View a;
public final android.graphics.Rect b;
public final android.graphics.Rect c;
public final android.graphics.Rect d;
public final Integer e;
public Boolean f;
/* # direct methods */
public androidx.appcompat.widget.SearchView$p ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0, p1, p3}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V */
/* .line 2 */
(( android.view.View ) p3 ).getContext ( ); // invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;
android.view.ViewConfiguration .get ( v0 );
v0 = (( android.view.ViewConfiguration ) v0 ).getScaledTouchSlop ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
/* iput v0, p0, Landroidx/appcompat/widget/SearchView$p;->e:I */
/* .line 3 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.b = v0;
/* .line 4 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.d = v0;
/* .line 5 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.c = v0;
/* .line 6 */
(( androidx.appcompat.widget.SearchView$p ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/SearchView$p;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
/* .line 7 */
this.a = p3;
return;
} // .end method
/* # virtual methods */
public void a ( android.graphics.Rect p0, android.graphics.Rect p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
(( android.graphics.Rect ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 2 */
v0 = this.d;
(( android.graphics.Rect ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 3 */
p1 = this.d;
/* iget v0, p0, Landroidx/appcompat/widget/SearchView$p;->e:I */
/* neg-int v1, v0 */
/* neg-int v0, v0 */
(( android.graphics.Rect ) p1 ).inset ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/graphics/Rect;->inset(II)V
/* .line 4 */
p1 = this.c;
(( android.graphics.Rect ) p1 ).set ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
/* .line 2 */
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v1, v1 */
/* .line 3 */
v2 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v3 = 2; // const/4 v3, 0x2
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
if ( v2 != null) { // if-eqz v2, :cond_3
	 /* if-eq v2, v4, :cond_1 */
	 /* if-eq v2, v3, :cond_1 */
	 int v6 = 3; // const/4 v6, 0x3
	 /* if-eq v2, v6, :cond_0 */
	 /* .line 4 */
} // :cond_0
/* iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView$p;->f:Z */
/* .line 5 */
/* iput-boolean v5, p0, Landroidx/appcompat/widget/SearchView$p;->f:Z */
/* .line 6 */
} // :cond_1
/* iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView$p;->f:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 7 */
v6 = this.d;
v6 = (( android.graphics.Rect ) v6 ).contains ( v0, v1 ); // invoke-virtual {v6, v0, v1}, Landroid/graphics/Rect;->contains(II)Z
/* if-nez v6, :cond_2 */
/* move v4, v2 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
} // :goto_0
/* move v4, v2 */
} // :goto_1
int v2 = 1; // const/4 v2, 0x1
/* .line 8 */
} // :cond_3
v2 = this.b;
v2 = (( android.graphics.Rect ) v2 ).contains ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 9 */
/* iput-boolean v4, p0, Landroidx/appcompat/widget/SearchView$p;->f:Z */
} // :cond_4
} // :goto_2
int v2 = 1; // const/4 v2, 0x1
int v4 = 0; // const/4 v4, 0x0
} // :goto_3
if ( v4 != null) { // if-eqz v4, :cond_6
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 10 */
v2 = this.c;
v2 = (( android.graphics.Rect ) v2 ).contains ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z
/* if-nez v2, :cond_5 */
/* .line 11 */
v0 = this.a;
v0 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
/* div-int/2addr v0, v3 */
/* int-to-float v0, v0 */
v1 = this.a;
/* .line 12 */
v1 = (( android.view.View ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/view/View;->getHeight()I
/* div-int/2addr v1, v3 */
/* int-to-float v1, v1 */
/* .line 13 */
(( android.view.MotionEvent ) p1 ).setLocation ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->setLocation(FF)V
/* .line 14 */
} // :cond_5
v2 = this.c;
/* iget v3, v2, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr v0, v3 */
/* int-to-float v0, v0 */
/* iget v2, v2, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
(( android.view.MotionEvent ) p1 ).setLocation ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->setLocation(FF)V
/* .line 15 */
} // :goto_4
v0 = this.a;
v5 = (( android.view.View ) v0 ).dispatchTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
} // :cond_6
} // .end method
