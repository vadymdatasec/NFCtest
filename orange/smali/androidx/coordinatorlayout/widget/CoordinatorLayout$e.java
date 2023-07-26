public class androidx.coordinatorlayout.widget.CoordinatorLayout$e extends android.view.ViewGroup$MarginLayoutParams {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "e" */
} // .end annotation
/* # instance fields */
public androidx.coordinatorlayout.widget.CoordinatorLayout$b a;
public Boolean b;
public Integer c;
public Integer d;
public Integer e;
public Integer f;
public Integer g;
public Integer h;
public Integer i;
public Integer j;
public android.view.View k;
public android.view.View l;
public Boolean m;
public Boolean n;
public Boolean o;
public Boolean p;
public final android.graphics.Rect q;
/* # direct methods */
public androidx.coordinatorlayout.widget.CoordinatorLayout$e ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
/* .line 3 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 4 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
int p2 = -1; // const/4 p2, -0x1
/* .line 5 */
/* iput p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->e:I */
/* .line 6 */
/* iput p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
/* .line 7 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 8 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 9 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.q = p1;
return;
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$e ( ) {
/* .locals 4 */
/* .line 10 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
/* iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
/* .line 12 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 13 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
int v1 = -1; // const/4 v1, -0x1
/* .line 14 */
/* iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->e:I */
/* .line 15 */
/* iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
/* .line 16 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 17 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 18 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
this.q = v2;
/* .line 19 */
v2 = c.g.c.CoordinatorLayout_Layout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 20 */
v3 = (( android.content.res.TypedArray ) v2 ).getInteger ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I
/* iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 21 */
v3 = (( android.content.res.TypedArray ) v2 ).getResourceId ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
/* .line 22 */
v3 = (( android.content.res.TypedArray ) v2 ).getInteger ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getInteger(II)I
/* iput v3, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
/* .line 23 */
v1 = (( android.content.res.TypedArray ) v2 ).getInteger ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I
/* iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->e:I */
/* .line 24 */
v1 = (( android.content.res.TypedArray ) v2 ).getInt ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 25 */
v0 = (( android.content.res.TypedArray ) v2 ).getInt ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 26 */
v0 = (( android.content.res.TypedArray ) v2 ).hasValue ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
/* iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 27 */
	 (( android.content.res.TypedArray ) v2 ).getString ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
	 androidx.coordinatorlayout.widget.CoordinatorLayout .a ( p1,p2,v0 );
	 this.a = p1;
	 /* .line 28 */
} // :cond_0
(( android.content.res.TypedArray ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V
/* .line 29 */
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 30 */
	 (( androidx.coordinatorlayout.widget.CoordinatorLayout$b ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;)V
} // :cond_1
return;
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$e ( ) {
/* .locals 1 */
/* .line 49 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 50 */
/* iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
/* .line 51 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 52 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
int v0 = -1; // const/4 v0, -0x1
/* .line 53 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->e:I */
/* .line 54 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
/* .line 55 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 56 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 57 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.q = p1;
return;
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$e ( ) {
/* .locals 1 */
/* .line 40 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 41 */
/* iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
/* .line 42 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 43 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
int v0 = -1; // const/4 v0, -0x1
/* .line 44 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->e:I */
/* .line 45 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
/* .line 46 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 47 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 48 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.q = p1;
return;
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$e ( ) {
/* .locals 1 */
/* .line 31 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 32 */
/* iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
/* .line 33 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c:I */
/* .line 34 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
int v0 = -1; // const/4 v0, -0x1
/* .line 35 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->e:I */
/* .line 36 */
/* iput v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
/* .line 37 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 38 */
/* iput p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 39 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.q = p1;
return;
} // .end method
/* # virtual methods */
public android.view.View a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) {
/* .locals 2 */
/* .line 16 */
/* iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 17 */
this.l = p1;
this.k = p1;
/* .line 18 */
} // :cond_0
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) p0 ).b ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b(Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Z
/* if-nez v0, :cond_2 */
/* .line 19 */
} // :cond_1
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->a(Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
/* .line 20 */
} // :cond_2
p1 = this.k;
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_0 */
/* .line 8 */
} // :cond_0
/* iput-boolean p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->o:Z */
/* .line 9 */
} // :cond_1
/* iput-boolean p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->n:Z */
} // :goto_0
return;
} // .end method
public void a ( android.graphics.Rect p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.q;
(( android.graphics.Rect ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
return;
} // .end method
public final void a ( android.view.View p0, androidx.coordinatorlayout.widget.CoordinatorLayout p1 ) {
/* .locals 4 */
/* .line 21 */
/* iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
(( android.view.ViewGroup ) p2 ).findViewById ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
this.k = v0;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_6
/* if-ne v0, p2, :cond_1 */
/* .line 22 */
p1 = (( android.view.ViewGroup ) p2 ).isInEditMode ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->isInEditMode()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 23 */
this.l = v1;
this.k = v1;
return;
/* .line 24 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "View can not be anchored to the the parent CoordinatorLayout"; // const-string p2, "View can not be anchored to the the parent CoordinatorLayout"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 25 */
} // :cond_1
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
} // :goto_0
/* if-eq v2, p2, :cond_5 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* if-ne v2, p1, :cond_3 */
/* .line 26 */
p1 = (( android.view.ViewGroup ) p2 ).isInEditMode ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->isInEditMode()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 27 */
this.l = v1;
this.k = v1;
return;
/* .line 28 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Anchor must not be a descendant of the anchored view"; // const-string p2, "Anchor must not be a descendant of the anchored view"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 29 */
} // :cond_3
/* instance-of v3, v2, Landroid/view/View; */
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 30 */
/* move-object v0, v2 */
/* check-cast v0, Landroid/view/View; */
/* .line 31 */
} // :cond_4
/* .line 32 */
} // :cond_5
this.l = v0;
return;
/* .line 33 */
} // :cond_6
v0 = (( android.view.ViewGroup ) p2 ).isInEditMode ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->isInEditMode()Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 34 */
this.l = v1;
this.k = v1;
return;
/* .line 35 */
} // :cond_7
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Could not find CoordinatorLayout descendant view with id "; // const-string v2, "Could not find CoordinatorLayout descendant view with id "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 36 */
(( android.view.ViewGroup ) p2 ).getResources ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
/* iget v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
(( android.content.res.Resources ) p2 ).getResourceName ( v2 ); // invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = " to anchor view "; // const-string p2, " to anchor view "
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout$b p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* if-eq v0, p1, :cond_1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$b ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a()V
/* .line 3 */
} // :cond_0
this.a = p1;
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 5 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$b ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;)V
} // :cond_1
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 12 */
/* iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->p:Z */
return;
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .line 7 */
v0 = this.k;
/* if-nez v0, :cond_0 */
/* iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 10 */
} // :cond_0
/* iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->o:Z */
/* .line 11 */
} // :cond_1
/* iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->n:Z */
} // .end method
public final Boolean a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 37 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 38 */
/* iget p1, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
p1 = c.h.n.i .a ( p1,p2 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 39 */
/* iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* .line 40 */
p2 = c.h.n.i .a ( v0,p2 );
/* and-int/2addr p2, p1 */
/* if-ne p2, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.l;
/* if-eq p3, v0, :cond_1 */
/* .line 14 */
v0 = c.h.n.v0 .o ( p1 );
v0 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) p0 ).a ( p3, v0 ); // invoke-virtual {p0, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->a(Landroid/view/View;I)Z
/* if-nez v0, :cond_1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$b ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->a(IZ)V
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->m:Z */
/* .line 3 */
} // :cond_0
/* iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->m:Z */
} // .end method
public final Boolean b ( android.view.View p0, androidx.coordinatorlayout.widget.CoordinatorLayout p1 ) {
/* .locals 4 */
/* .line 8 */
v0 = this.k;
v0 = (( android.view.View ) v0 ).getId ( ); // invoke-virtual {v0}, Landroid/view/View;->getId()I
/* iget v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
int v2 = 0; // const/4 v2, 0x0
/* if-eq v0, v1, :cond_0 */
/* .line 9 */
} // :cond_0
v0 = this.k;
/* .line 10 */
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
} // :goto_0
/* if-eq v1, p2, :cond_4 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* if-ne v1, p1, :cond_1 */
/* .line 11 */
} // :cond_1
/* instance-of v3, v1, Landroid/view/View; */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 12 */
/* move-object v0, v1 */
/* check-cast v0, Landroid/view/View; */
/* .line 13 */
} // :cond_2
} // :cond_3
} // :goto_1
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
this.l = p1;
this.k = p1;
/* .line 15 */
} // :cond_4
this.l = v0;
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) {
/* .locals 2 */
/* .line 4 */
/* iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
} // :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$b ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Z
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* or-int/2addr p1, v0 */
/* iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->m:Z */
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->f:I */
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$b d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->p:Z */
} // .end method
public android.graphics.Rect f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
} // .end method
public void g ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->p:Z */
return;
} // .end method
public void h ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->m:Z */
return;
} // .end method
