public abstract class androidx.recyclerview.widget.RecyclerView$o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "o" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Landroidx/recyclerview/widget/RecyclerView$o$b;, */
/* Landroidx/recyclerview/widget/RecyclerView$o$a; */
/* } */
} // .end annotation
/* # instance fields */
public c.r.d.c a;
public androidx.recyclerview.widget.RecyclerView b;
public final c.r.d.p0 c;
public final c.r.d.p0 d;
public c.r.d.q0 e;
public c.r.d.q0 f;
public androidx.recyclerview.widget.RecyclerView$z g;
public Boolean h;
public Boolean i;
public Boolean j;
public Boolean k;
public Integer l;
public Boolean m;
public Integer n;
public Integer o;
public Integer p;
public Integer q;
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$o ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/r/d/e0; */
/* invoke-direct {v0, p0}, Lc/r/d/e0;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;)V */
this.c = v0;
/* .line 3 */
/* new-instance v0, Lc/r/d/f0; */
/* invoke-direct {v0, p0}, Lc/r/d/f0;-><init>(Landroidx/recyclerview/widget/RecyclerView$o;)V */
this.d = v0;
/* .line 4 */
/* new-instance v0, Lc/r/d/q0; */
v1 = this.c;
/* invoke-direct {v0, v1}, Lc/r/d/q0;-><init>(Lc/r/d/p0;)V */
this.e = v0;
/* .line 5 */
/* new-instance v0, Lc/r/d/q0; */
v1 = this.d;
/* invoke-direct {v0, v1}, Lc/r/d/q0;-><init>(Lc/r/d/p0;)V */
this.f = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->h:Z */
/* .line 7 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->i:Z */
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->j:Z */
/* .line 9 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->k:Z */
return;
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 6 */
v0 = android.view.View$MeasureSpec .getMode ( p0 );
/* .line 7 */
p0 = android.view.View$MeasureSpec .getSize ( p0 );
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-eq v0, v1, :cond_0 */
/* .line 8 */
p0 = java.lang.Math .max ( p1,p2 );
} // :cond_0
/* .line 9 */
} // :cond_1
p1 = java.lang.Math .max ( p1,p2 );
p0 = java.lang.Math .min ( p0,p1 );
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 4 */
/* sub-int/2addr p0, p2 */
int p2 = 0; // const/4 p2, 0x0
/* .line 100 */
p0 = java.lang.Math .max ( p2,p0 );
int v0 = -2; // const/4 v0, -0x2
int v1 = -1; // const/4 v1, -0x1
/* const/high16 v2, -0x80000000 */
/* const/high16 v3, 0x40000000 # 2.0f */
if ( p4 != null) { // if-eqz p4, :cond_1
/* if-ltz p3, :cond_0 */
} // :cond_0
/* if-ne p3, v1, :cond_7 */
/* if-eq p1, v2, :cond_3 */
if ( p1 != null) { // if-eqz p1, :cond_7
/* if-eq p1, v3, :cond_3 */
} // :cond_1
/* if-ltz p3, :cond_2 */
} // :goto_0
/* const/high16 p1, 0x40000000 # 2.0f */
} // :cond_2
/* if-ne p3, v1, :cond_4 */
} // :cond_3
} // :goto_1
/* move p3, p0 */
} // :cond_4
/* if-ne p3, v0, :cond_7 */
/* if-eq p1, v2, :cond_6 */
/* if-ne p1, v3, :cond_5 */
} // :cond_5
int p1 = 0; // const/4 p1, 0x0
} // :cond_6
} // :goto_2
/* const/high16 p1, -0x80000000 */
} // :cond_7
} // :goto_3
int p1 = 0; // const/4 p1, 0x0
int p3 = 0; // const/4 p3, 0x0
/* .line 101 */
} // :goto_4
p0 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p1 );
} // .end method
public static androidx.recyclerview.widget.RecyclerView$o$b a ( android.content.Context p0, android.util.AttributeSet p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .line 191 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$o$b; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$o$b;-><init>()V */
/* .line 192 */
v1 = c.r.c.RecyclerView;
(( android.content.Context ) p0 ).obtainStyledAttributes ( p1, v1, p2, p3 ); // invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 193 */
int p2 = 1; // const/4 p2, 0x1
p1 = (( android.content.res.TypedArray ) p0 ).getInt ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p1, v0, Landroidx/recyclerview/widget/RecyclerView$o$b;->a:I */
/* .line 194 */
p1 = (( android.content.res.TypedArray ) p0 ).getInt ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p1, v0, Landroidx/recyclerview/widget/RecyclerView$o$b;->b:I */
/* .line 195 */
int p2 = 0; // const/4 p2, 0x0
p1 = (( android.content.res.TypedArray ) p0 ).getBoolean ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean p1, v0, Landroidx/recyclerview/widget/RecyclerView$o$b;->c:Z */
/* .line 196 */
p1 = (( android.content.res.TypedArray ) p0 ).getBoolean ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean p1, v0, Landroidx/recyclerview/widget/RecyclerView$o$b;->d:Z */
/* .line 197 */
(( android.content.res.TypedArray ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
} // .end method
public static Boolean b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .line 20 */
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* .line 21 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
int v1 = 0; // const/4 v1, 0x0
/* if-lez p2, :cond_0 */
/* if-eq p0, p2, :cond_0 */
} // :cond_0
/* const/high16 p2, -0x80000000 */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, p2, :cond_4 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* const/high16 p2, 0x40000000 # 2.0f */
/* if-eq v0, p2, :cond_1 */
} // :cond_1
/* if-ne p1, p0, :cond_2 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // :cond_3
} // :cond_4
/* if-lt p1, p0, :cond_5 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_5
} // .end method
/* # virtual methods */
public Boolean A ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void B ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$z ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$z;->d()V
} // :cond_0
return;
} // .end method
public abstract Boolean C ( ) {
} // .end method
public abstract Integer a ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
} // .end method
public abstract Integer a ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
} // .end method
public Integer a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 0 */
/* .line 177 */
p1 = this.b;
int p2 = 1; // const/4 p2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.m;
/* if-nez p1, :cond_0 */
/* .line 178 */
} // :cond_0
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.b;
p1 = this.m;
p2 = (( androidx.recyclerview.widget.RecyclerView$g ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
} // :cond_1
} // :goto_0
} // .end method
public abstract android.view.View a ( android.view.View p0, Integer p1, androidx.recyclerview.widget.RecyclerView$v p2, androidx.recyclerview.widget.RecyclerView$a0 p3 ) {
} // .end method
public androidx.recyclerview.widget.RecyclerView$p a ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 28 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$p; */
/* invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public androidx.recyclerview.widget.RecyclerView$p a ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 23 */
/* instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$p; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 24 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$p; */
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroidx/recyclerview/widget/RecyclerView$p;)V */
/* .line 25 */
} // :cond_0
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 26 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$p; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
/* .line 27 */
} // :cond_1
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$p; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 54 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(ILandroid/view/View;)V
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 61 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 62 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(I)V
/* .line 63 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroid/view/View;I)V
return;
/* .line 64 */
} // :cond_0
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Cannot move a child from non-existing index:"; // const-string v1, "Cannot move a child from non-existing index:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
p1 = this.b;
/* .line 65 */
(( android.view.ViewGroup ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public abstract void a ( Integer p0, Integer p1, androidx.recyclerview.widget.RecyclerView$a0 p2, androidx.recyclerview.widget.RecyclerView$o$a p3 ) {
} // .end method
public final void a ( Integer p0, android.view.View p1 ) {
/* .locals 0 */
/* .line 55 */
p2 = this.a;
(( c.r.d.c ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/r/d/c;->a(I)V
return;
} // .end method
public void a ( Integer p0, androidx.recyclerview.widget.RecyclerView$o$a p1 ) {
/* .locals 0 */
return;
} // .end method
public void a ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1 ) {
/* .locals 1 */
/* .line 68 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 69 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->g(I)V
/* .line 70 */
(( androidx.recyclerview.widget.RecyclerView$v ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->b(Landroid/view/View;)V
return;
} // .end method
public void a ( android.graphics.Rect p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.graphics.Rect ) p1 ).width ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->width()I
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
/* add-int/2addr v0, v1 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* add-int/2addr v0, v1 */
/* .line 2 */
p1 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
/* add-int/2addr p1, v1 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* add-int/2addr p1, v1 */
/* .line 3 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->l()I
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( p2,v0,v1 );
/* .line 4 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k()I
p1 = androidx.recyclerview.widget.RecyclerView$o .a ( p3,p1,v0 );
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(II)V
return;
} // .end method
public abstract void a ( android.os.Parcelable p0 ) {
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 29 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;I)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 30 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IZ)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .line 86 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 87 */
v1 = this.b;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).g ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->g(Landroid/view/View;)Landroid/graphics/Rect;
/* .line 88 */
/* iget v2, v1, Landroid/graphics/Rect;->left:I */
/* iget v3, v1, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v2, v3 */
/* add-int/2addr p2, v2 */
/* .line 89 */
/* iget v2, v1, Landroid/graphics/Rect;->top:I */
/* iget v1, v1, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v2, v1 */
/* add-int/2addr p3, v2 */
/* .line 90 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->r()I
/* .line 91 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* add-int/2addr v3, v4 */
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v3, v4 */
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v3, v4 */
/* add-int/2addr v3, p2 */
/* iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 92 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a()Z
/* .line 93 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,v2,v3,p2,v4 );
/* .line 94 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i()I
/* .line 95 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* add-int/2addr v3, v4 */
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v3, v4 */
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v4 */
/* add-int/2addr v3, p3 */
/* iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 96 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->b()Z
/* .line 97 */
p3 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,v2,v3,p3,v4 );
/* .line 98 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$p;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 99 */
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 3 */
/* .line 102 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 103 */
v1 = this.b;
/* .line 104 */
/* iget v2, v1, Landroid/graphics/Rect;->left:I */
/* add-int/2addr p2, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr p2, v2 */
/* iget v2, v1, Landroid/graphics/Rect;->top:I */
/* add-int/2addr p3, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr p3, v2 */
/* iget v2, v1, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr p4, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* sub-int/2addr p4, v2 */
/* iget v1, v1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr p5, v1 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr p5, v0 */
(( android.view.View ) p1 ).layout ( p2, p3, p4, p5 ); // invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, androidx.recyclerview.widget.RecyclerView$p p2 ) {
/* .locals 2 */
/* .line 56 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
/* .line 57 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).r ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 58 */
v1 = this.b;
v1 = this.g;
(( c.r.d.s0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/s0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 59 */
} // :cond_0
v1 = this.b;
v1 = this.g;
(( c.r.d.s0 ) v1 ).g ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/s0;->g(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 60 */
} // :goto_0
v1 = this.a;
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).r ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
(( c.r.d.c ) v1 ).a ( p1, p2, p3, v0 ); // invoke-virtual {v1, p1, p2, p3, v0}, Lc/r/d/c;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Boolean p2 ) {
/* .locals 4 */
/* .line 31 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
/* if-nez p3, :cond_1 */
/* .line 32 */
p3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).r ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 33 */
} // :cond_0
p3 = this.b;
p3 = this.g;
(( c.r.d.s0 ) p3 ).g ( v0 ); // invoke-virtual {p3, v0}, Lc/r/d/s0;->g(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 34 */
} // :cond_1
} // :goto_0
p3 = this.b;
p3 = this.g;
(( c.r.d.s0 ) p3 ).a ( v0 ); // invoke-virtual {p3, v0}, Lc/r/d/s0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 35 */
} // :goto_1
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p3, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 36 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).B ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->B()Z
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_6 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).s ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 37 */
} // :cond_2
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
v3 = this.b;
/* if-ne v1, v3, :cond_5 */
/* .line 38 */
v1 = this.a;
v1 = (( c.r.d.c ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/c;->c(Landroid/view/View;)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne p2, v3, :cond_3 */
/* .line 39 */
p2 = this.a;
p2 = (( c.r.d.c ) p2 ).a ( ); // invoke-virtual {p2}, Lc/r/d/c;->a()I
} // :cond_3
/* if-eq v1, v3, :cond_4 */
/* if-eq v1, p2, :cond_8 */
/* .line 40 */
p1 = this.b;
p1 = this.n;
(( androidx.recyclerview.widget.RecyclerView$o ) p1 ).a ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(II)V
/* .line 41 */
} // :cond_4
/* new-instance p2, Ljava/lang/IllegalStateException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Added View has RecyclerView as parent but view is not a real child.Unfiltered index:"; // const-string v0, "Added View has RecyclerView as parent but view is not a real child.Unfiltered index:"
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.b;
/* .line 42 */
p1 = (( android.view.ViewGroup ) v0 ).indexOfChild ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
p1 = this.b;
(( androidx.recyclerview.widget.RecyclerView ) p1 ).n ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->n()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 43 */
} // :cond_5
v1 = this.a;
(( c.r.d.c ) v1 ).a ( p1, p2, v2 ); // invoke-virtual {v1, p1, p2, v2}, Lc/r/d/c;->a(Landroid/view/View;IZ)V
int p2 = 1; // const/4 p2, 0x1
/* .line 44 */
/* iput-boolean p2, p3, Landroidx/recyclerview/widget/RecyclerView$p;->c:Z */
/* .line 45 */
p2 = this.g;
if ( p2 != null) { // if-eqz p2, :cond_8
p2 = (( androidx.recyclerview.widget.RecyclerView$z ) p2 ).c ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$z;->c()Z
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 46 */
p2 = this.g;
(( androidx.recyclerview.widget.RecyclerView$z ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$z;->a(Landroid/view/View;)V
/* .line 47 */
} // :cond_6
} // :goto_2
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).s ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 48 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).A ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->A()V
/* .line 49 */
} // :cond_7
(( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->c()V
/* .line 50 */
} // :goto_3
v1 = this.a;
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
(( c.r.d.c ) v1 ).a ( p1, p2, v3, v2 ); // invoke-virtual {v1, p1, p2, v3, v2}, Lc/r/d/c;->a(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
/* .line 51 */
} // :cond_8
} // :goto_4
/* iget-boolean p1, p3, Landroidx/recyclerview/widget/RecyclerView$p;->d:Z */
if ( p1 != null) { // if-eqz p1, :cond_9
/* .line 52 */
p1 = this.a;
(( android.view.View ) p1 ).invalidate ( ); // invoke-virtual {p1}, Landroid/view/View;->invalidate()V
/* .line 53 */
/* iput-boolean v2, p3, Landroidx/recyclerview/widget/RecyclerView$p;->d:Z */
} // :cond_9
return;
} // .end method
public void a ( android.view.View p0, android.graphics.Rect p1 ) {
/* .locals 1 */
/* .line 123 */
v0 = this.b;
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 124 */
(( android.graphics.Rect ) p2 ).set ( p1, p1, p1, p1 ); // invoke-virtual {p2, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V
return;
/* .line 125 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView ) v0 ).g ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->g(Landroid/view/View;)Landroid/graphics/Rect;
/* .line 126 */
(( android.graphics.Rect ) p2 ).set ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
return;
} // .end method
public void a ( android.view.View p0, androidx.recyclerview.widget.RecyclerView$v p1 ) {
/* .locals 0 */
/* .line 66 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->o(Landroid/view/View;)V
/* .line 67 */
(( androidx.recyclerview.widget.RecyclerView$v ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->b(Landroid/view/View;)V
return;
} // .end method
public void a ( android.view.View p0, Object p1 ) {
/* .locals 2 */
/* .line 170 */
androidx.recyclerview.widget.RecyclerView .l ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 171 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).r ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez v1, :cond_0 */
v1 = this.a;
v0 = this.a;
v0 = (( c.r.d.c ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/c;->d(Landroid/view/View;)Z
/* if-nez v0, :cond_0 */
/* .line 172 */
v0 = this.b;
v1 = this.c;
v0 = this.i0;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v1, v0, p1, p2 ); // invoke-virtual {p0, v1, v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroid/view/View;Lc/h/n/v1/h;)V
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, Boolean p1, android.graphics.Rect p2 ) {
/* .locals 5 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 105 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroidx/recyclerview/widget/RecyclerView$p; */
p2 = this.b;
/* .line 106 */
/* iget v0, p2, Landroid/graphics/Rect;->left:I */
/* neg-int v0, v0 */
/* iget v1, p2, Landroid/graphics/Rect;->top:I */
/* neg-int v1, v1 */
/* .line 107 */
v2 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* iget v3, p2, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v2, v3 */
v3 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* iget p2, p2, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v3, p2 */
/* .line 108 */
(( android.graphics.Rect ) p3 ).set ( v0, v1, v2, v3 ); // invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V
/* .line 109 */
} // :cond_0
p2 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
v0 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
int v1 = 0; // const/4 v1, 0x0
(( android.graphics.Rect ) p3 ).set ( v1, v1, p2, v0 ); // invoke-virtual {p3, v1, v1, p2, v0}, Landroid/graphics/Rect;->set(IIII)V
/* .line 110 */
} // :goto_0
p2 = this.b;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 111 */
(( android.view.View ) p1 ).getMatrix ( ); // invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 112 */
v0 = (( android.graphics.Matrix ) p2 ).isIdentity ( ); // invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z
/* if-nez v0, :cond_1 */
/* .line 113 */
v0 = this.b;
v0 = this.l;
/* .line 114 */
(( android.graphics.RectF ) v0 ).set ( p3 ); // invoke-virtual {v0, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V
/* .line 115 */
(( android.graphics.Matrix ) p2 ).mapRect ( v0 ); // invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
/* .line 116 */
/* iget p2, v0, Landroid/graphics/RectF;->left:F */
/* float-to-double v1, p2 */
/* .line 117 */
java.lang.Math .floor ( v1,v2 );
/* move-result-wide v1 */
/* double-to-int p2, v1 */
/* iget v1, v0, Landroid/graphics/RectF;->top:F */
/* float-to-double v1, v1 */
/* .line 118 */
java.lang.Math .floor ( v1,v2 );
/* move-result-wide v1 */
/* double-to-int v1, v1 */
/* iget v2, v0, Landroid/graphics/RectF;->right:F */
/* float-to-double v2, v2 */
/* .line 119 */
java.lang.Math .ceil ( v2,v3 );
/* move-result-wide v2 */
/* double-to-int v2, v2 */
/* iget v0, v0, Landroid/graphics/RectF;->bottom:F */
/* float-to-double v3, v0 */
/* .line 120 */
java.lang.Math .ceil ( v3,v4 );
/* move-result-wide v3 */
/* double-to-int v0, v3 */
/* .line 121 */
(( android.graphics.Rect ) p3 ).set ( p2, v1, v2, v0 ); // invoke-virtual {p3, p2, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V
/* .line 122 */
} // :cond_1
p2 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
p1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
(( android.graphics.Rect ) p3 ).offset ( p2, p1 ); // invoke-virtual {p3, p2, p1}, Landroid/graphics/Rect;->offset(II)V
return;
} // .end method
public void a ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 2 */
/* .line 161 */
v0 = this.b;
v1 = this.c;
v0 = this.i0;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v1, v0, p1 ); // invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroid/view/accessibility/AccessibilityEvent;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$g p0, androidx.recyclerview.widget.RecyclerView$g p1 ) {
/* .locals 0 */
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0 ) {
/* .locals 2 */
/* .line 71 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 72 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 73 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;ILandroid/view/View;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$v p0, Integer p1, android.view.View p2 ) {
/* .locals 2 */
/* .line 74 */
androidx.recyclerview.widget.RecyclerView .l ( p3 );
/* .line 75 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).z ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
if ( v1 != null) { // if-eqz v1, :cond_0
return;
/* .line 76 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).p ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v0 ).r ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez v1, :cond_1 */
v1 = this.b;
v1 = this.m;
/* .line 77 */
v1 = (( androidx.recyclerview.widget.RecyclerView$g ) v1 ).b ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
/* if-nez v1, :cond_1 */
/* .line 78 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).g ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->g(I)V
/* .line 79 */
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 80 */
} // :cond_1
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(I)V
/* .line 81 */
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).c ( p3 ); // invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$v;->c(Landroid/view/View;)V
/* .line 82 */
p1 = this.b;
p1 = this.g;
(( c.r.d.s0 ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/s0;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :goto_0
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 147 */
p1 = this.b;
(( androidx.recyclerview.widget.RecyclerView ) p1 ).c ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->c(II)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, android.view.View p2, Object p3 ) {
/* .locals 6 */
/* .line 173 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->b()Z
int p2 = 0; // const/4 p2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( p3 ); // invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* move v0, p1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 174 */
} // :goto_0
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_1
p2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( p3 ); // invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* move v2, p2 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
int v1 = 1; // const/4 v1, 0x1
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 175 */
/* invoke-static/range {v0 ..v5}, Lc/h/n/v1/h$a;->a(IIIIZZ)Lc/h/n/v1/h$a; */
/* .line 176 */
(( c.h.n.v1.h ) p4 ).b ( p1 ); // invoke-virtual {p4, p1}, Lc/h/n/v1/h;->b(Ljava/lang/Object;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, android.view.accessibility.AccessibilityEvent p2 ) {
/* .locals 1 */
/* .line 162 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_3
/* if-nez p3, :cond_0 */
} // :cond_0
int p2 = 1; // const/4 p2, 0x1
/* .line 163 */
p1 = (( android.view.ViewGroup ) p1 ).canScrollVertically ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z
/* if-nez p1, :cond_2 */
p1 = this.b;
int v0 = -1; // const/4 v0, -0x1
/* .line 164 */
p1 = (( android.view.ViewGroup ) p1 ).canScrollVertically ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->canScrollVertically(I)Z
/* if-nez p1, :cond_2 */
p1 = this.b;
/* .line 165 */
p1 = (( android.view.ViewGroup ) p1 ).canScrollHorizontally ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z
/* if-nez p1, :cond_2 */
p1 = this.b;
/* .line 166 */
p1 = (( android.view.ViewGroup ) p1 ).canScrollHorizontally ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
/* .line 167 */
} // :cond_2
} // :goto_0
(( android.view.accessibility.AccessibilityEvent ) p3 ).setScrollable ( p2 ); // invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V
/* .line 168 */
p1 = this.b;
p1 = this.m;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 169 */
p1 = (( androidx.recyclerview.widget.RecyclerView$g ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
(( android.view.accessibility.AccessibilityEvent ) p3 ).setItemCount ( p1 ); // invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V
} // :cond_3
} // :goto_1
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Object p2 ) {
/* .locals 3 */
/* .line 149 */
v0 = this.b;
int v1 = -1; // const/4 v1, -0x1
v0 = (( android.view.ViewGroup ) v0 ).canScrollVertically ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollVertically(I)Z
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_0 */
v0 = this.b;
v0 = (( android.view.ViewGroup ) v0 ).canScrollHorizontally ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
/* const/16 v0, 0x2000 */
/* .line 150 */
(( c.h.n.v1.h ) p3 ).a ( v0 ); // invoke-virtual {p3, v0}, Lc/h/n/v1/h;->a(I)V
/* .line 151 */
(( c.h.n.v1.h ) p3 ).f ( v2 ); // invoke-virtual {p3, v2}, Lc/h/n/v1/h;->f(Z)V
/* .line 152 */
} // :cond_1
v0 = this.b;
v0 = (( android.view.ViewGroup ) v0 ).canScrollVertically ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z
/* if-nez v0, :cond_2 */
v0 = this.b;
v0 = (( android.view.ViewGroup ) v0 ).canScrollHorizontally ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_2
/* const/16 v0, 0x1000 */
/* .line 153 */
(( c.h.n.v1.h ) p3 ).a ( v0 ); // invoke-virtual {p3, v0}, Lc/h/n/v1/h;->a(I)V
/* .line 154 */
(( c.h.n.v1.h ) p3 ).f ( v2 ); // invoke-virtual {p3, v2}, Lc/h/n/v1/h;->f(Z)V
/* .line 155 */
} // :cond_3
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 156 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 157 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->d(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Z
/* .line 158 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 159 */
c.h.n.v1.g .a ( v0,v1,v2,p1 );
/* .line 160 */
(( c.h.n.v1.h ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Lc/h/n/v1/h;->a(Ljava/lang/Object;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 17 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->i:Z */
/* .line 18 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2, java.lang.Object p3 ) {
/* .locals 0 */
/* .line 146 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).d ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->d(Landroidx/recyclerview/widget/RecyclerView;II)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView$v p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 19 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->i:Z */
/* .line 20 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$v;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 148 */
v0 = this.b;
v1 = this.c;
v0 = this.i0;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v1, v0, p1 ); // invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Lc/h/n/v1/h;)V
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->a(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 12 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->k:Z */
/* if-eq p1, v0, :cond_0 */
/* .line 13 */
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->k:Z */
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->l:I */
/* .line 15 */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 16 */
p1 = this.c;
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).j ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$v;->j()V
} // :cond_0
return;
} // .end method
public abstract Boolean a ( ) {
} // .end method
public Boolean a ( Integer p0, android.os.Bundle p1 ) {
/* .locals 2 */
/* .line 179 */
v0 = this.b;
v1 = this.c;
v0 = this.i0;
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v1, v0, p1, p2 ); // invoke-virtual {p0, v1, v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;ILandroid/os/Bundle;)Z
} // .end method
public Boolean a ( android.view.View p0, Integer p1, Integer p2, androidx.recyclerview.widget.RecyclerView$p p3 ) {
/* .locals 2 */
/* .line 83 */
v0 = (( android.view.View ) p1 ).isLayoutRequested ( ); // invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 84 */
v0 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
p2 = androidx.recyclerview.widget.RecyclerView$o .b ( v0,p2,v1 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 85 */
p1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
p1 = androidx.recyclerview.widget.RecyclerView$o .b ( p1,p3,p2 );
/* if-nez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 7 */
/* .line 190 */
v0 = this.b;
v2 = this.c;
v3 = this.i0;
/* move-object v1, p0 */
/* move-object v4, p1 */
/* move v5, p2 */
/* move-object v6, p3 */
p1 = /* invoke-virtual/range {v1 ..v6}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroid/view/View;ILandroid/os/Bundle;)Z */
} // .end method
public Boolean a ( android.view.View p0, Boolean p1, Boolean p2 ) {
/* .locals 2 */
/* .line 134 */
p3 = this.e;
/* const/16 v0, 0x6003 */
p3 = (( c.r.d.q0 ) p3 ).a ( p1, v0 ); // invoke-virtual {p3, p1, v0}, Lc/r/d/q0;->a(Landroid/view/View;I)Z
int v1 = 1; // const/4 v1, 0x1
if ( p3 != null) { // if-eqz p3, :cond_0
p3 = this.f;
/* .line 135 */
p1 = (( c.r.d.q0 ) p3 ).a ( p1, v0 ); // invoke-virtual {p3, p1, v0}, Lc/r/d/q0;->a(Landroid/view/View;I)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
} // :cond_1
/* xor-int/2addr p1, v1 */
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$p p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Integer p2, android.os.Bundle p3 ) {
/* .locals 7 */
/* .line 180 */
p1 = this.b;
int p2 = 0; // const/4 p2, 0x0
/* if-nez p1, :cond_0 */
} // :cond_0
/* const/16 p4, 0x1000 */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p3, p4, :cond_3 */
/* const/16 p4, 0x2000 */
/* if-eq p3, p4, :cond_1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :cond_1
int p3 = -1; // const/4 p3, -0x1
/* .line 181 */
p1 = (( android.view.ViewGroup ) p1 ).canScrollVertically ( p3 ); // invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->canScrollVertically(I)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 182 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
/* sub-int/2addr p1, p4 */
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* sub-int/2addr p1, p4 */
/* neg-int p1, p1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 183 */
} // :goto_0
p4 = this.b;
p3 = (( android.view.ViewGroup ) p4 ).canScrollHorizontally ( p3 ); // invoke-virtual {p4, p3}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 184 */
p3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
/* sub-int/2addr p3, p4 */
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* sub-int/2addr p3, p4 */
/* neg-int p3, p3 */
/* .line 185 */
} // :cond_3
p1 = (( android.view.ViewGroup ) p1 ).canScrollVertically ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->canScrollVertically(I)Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 186 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
p3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
/* sub-int/2addr p1, p3 */
p3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* sub-int/2addr p1, p3 */
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
/* .line 187 */
} // :goto_1
p3 = this.b;
p3 = (( android.view.ViewGroup ) p3 ).canScrollHorizontally ( v0 ); // invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->canScrollHorizontally(I)Z
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 188 */
p3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
/* sub-int/2addr p3, p4 */
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* sub-int/2addr p3, p4 */
} // :goto_2
/* move v3, p1 */
/* move v2, p3 */
} // :cond_5
/* move v3, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_3
/* if-nez v3, :cond_6 */
/* if-nez v2, :cond_6 */
/* .line 189 */
} // :cond_6
v1 = this.b;
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, -0x80000000 */
int v6 = 1; // const/4 v6, 0x1
/* invoke-virtual/range {v1 ..v6}, Landroidx/recyclerview/widget/RecyclerView;->a(IILandroid/view/animation/Interpolator;IZ)V */
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, android.view.View p2, Integer p3, android.os.Bundle p4 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .line 136 */
(( android.view.ViewGroup ) p1 ).getFocusedChild ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 137 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
/* .line 138 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
/* .line 139 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* sub-int/2addr v3, v4 */
/* .line 140 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* sub-int/2addr v4, v5 */
/* .line 141 */
v5 = this.b;
v5 = this.j;
/* .line 142 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1, v5 ); // invoke-virtual {p0, p1, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 143 */
/* iget p1, v5, Landroid/graphics/Rect;->left:I */
/* sub-int/2addr p1, p2 */
/* if-ge p1, v3, :cond_2 */
/* iget p1, v5, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr p1, p2 */
/* if-le p1, v1, :cond_2 */
/* iget p1, v5, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr p1, p3 */
/* if-ge p1, v4, :cond_2 */
/* iget p1, v5, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr p1, p3 */
/* if-gt p1, v2, :cond_1 */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
} // :goto_0
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView p0, android.view.View p1, android.graphics.Rect p2, Boolean p3 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move v4, p4 */
/* .line 127 */
p1 = /* invoke-virtual/range {v0 ..v5}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z */
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView p0, android.view.View p1, android.graphics.Rect p2, Boolean p3, Boolean p4 ) {
/* .locals 2 */
/* .line 128 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;Landroid/graphics/Rect;)[I
int p3 = 0; // const/4 p3, 0x0
/* .line 129 */
/* aget v0, p2, p3 */
int v1 = 1; // const/4 v1, 0x1
/* .line 130 */
/* aget p2, p2, v1 */
if ( p5 != null) { // if-eqz p5, :cond_0
/* .line 131 */
p5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView;II)Z
if ( p5 != null) { // if-eqz p5, :cond_1
} // :cond_0
/* if-nez v0, :cond_2 */
if ( p2 != null) { // if-eqz p2, :cond_1
} // :cond_1
} // :cond_2
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 132 */
(( androidx.recyclerview.widget.RecyclerView ) p1 ).scrollBy ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V
/* .line 133 */
} // :cond_3
(( androidx.recyclerview.widget.RecyclerView ) p1 ).j ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->j(II)V
} // :goto_1
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView p0, android.view.View p1, android.view.View p2 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 144 */
p2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).w ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->w()Z
/* if-nez p2, :cond_1 */
p1 = (( androidx.recyclerview.widget.RecyclerView ) p1 ).w ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->w()Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView$a0 p1, android.view.View p2, android.view.View p3 ) {
/* .locals 0 */
/* .line 145 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p3, p4 ); // invoke-virtual {p0, p1, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView p0, java.util.ArrayList p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/recyclerview/widget/RecyclerView;", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;II)Z" */
/* } */
} // .end annotation
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .line 21 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
p1 = (( android.view.ViewGroup ) v0 ).removeCallbacks ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public abstract Integer b ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
} // .end method
public abstract Integer b ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
} // .end method
public Integer b ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 0 */
/* .line 42 */
p1 = this.b;
int p2 = 1; // const/4 p2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.m;
/* if-nez p1, :cond_0 */
/* .line 43 */
} // :cond_0
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->b()Z
if ( p1 != null) { // if-eqz p1, :cond_1
p1 = this.b;
p1 = this.m;
p2 = (( androidx.recyclerview.widget.RecyclerView$g ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
} // :cond_1
} // :goto_0
} // .end method
public android.view.View b ( Integer p0 ) {
/* .locals 5 */
/* .line 12 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_3 */
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 14 */
androidx.recyclerview.widget.RecyclerView .l ( v2 );
/* if-nez v3, :cond_0 */
/* .line 15 */
} // :cond_0
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).j ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I
/* if-ne v4, p1, :cond_2 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).z ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
/* if-nez v4, :cond_2 */
v4 = this.b;
v4 = this.i0;
/* .line 16 */
v4 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v4 ).d ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez v4, :cond_1 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).r ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez v3, :cond_2 */
} // :cond_1
} // :cond_2
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = android.view.View$MeasureSpec .getSize ( p1 );
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->p:I */
/* .line 2 */
p1 = android.view.View$MeasureSpec .getMode ( p1 );
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->n:I */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 3 */
/* sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->B0:Z */
/* if-nez p1, :cond_0 */
/* .line 4 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->p:I */
/* .line 5 */
} // :cond_0
p1 = android.view.View$MeasureSpec .getSize ( p2 );
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->q:I */
/* .line 6 */
p1 = android.view.View$MeasureSpec .getMode ( p2 );
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->o:I */
/* if-nez p1, :cond_1 */
/* .line 7 */
/* sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->B0:Z */
/* if-nez p1, :cond_1 */
/* .line 8 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->q:I */
} // :cond_1
return;
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 10 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;I)V
return;
} // .end method
public void b ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IZ)V
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$v p0 ) {
/* .locals 2 */
/* .line 38 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 39 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 40 */
androidx.recyclerview.widget.RecyclerView .l ( v1 );
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).z ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
/* if-nez v1, :cond_0 */
/* .line 41 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(ILandroidx/recyclerview/widget/RecyclerView$v;)V
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView$v p1 ) {
/* .locals 0 */
/* .line 9 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroidx/recyclerview/widget/RecyclerView;)V
return;
} // .end method
public abstract Boolean b ( ) {
} // .end method
public Boolean b ( android.view.View p0, Integer p1, Integer p2, androidx.recyclerview.widget.RecyclerView$p p3 ) {
/* .locals 2 */
/* .line 17 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 18 */
v0 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
p2 = androidx.recyclerview.widget.RecyclerView$o .b ( v0,p2,v1 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 19 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
p1 = androidx.recyclerview.widget.RecyclerView$o .b ( p1,p3,p2 );
/* if-nez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public final b ( android.view.View p0, android.graphics.Rect p1 ) {
/* .locals 9 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [I */
/* .line 22 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
/* .line 23 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
/* .line 24 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* sub-int/2addr v3, v4 */
/* .line 25 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* sub-int/2addr v4, v5 */
/* .line 26 */
v5 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* iget v6, p2, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v5, v6 */
v6 = (( android.view.View ) p1 ).getScrollX ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
/* sub-int/2addr v5, v6 */
/* .line 27 */
v6 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* iget v7, p2, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v6, v7 */
p1 = (( android.view.View ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
/* sub-int/2addr v6, p1 */
/* .line 28 */
p1 = (( android.graphics.Rect ) p2 ).width ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->width()I
/* add-int/2addr p1, v5 */
/* .line 29 */
p2 = (( android.graphics.Rect ) p2 ).height ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->height()I
/* add-int/2addr p2, v6 */
/* sub-int/2addr v5, v1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
v7 = java.lang.Math .min ( v1,v5 );
/* sub-int/2addr v6, v2 */
/* .line 31 */
v2 = java.lang.Math .min ( v1,v6 );
/* sub-int/2addr p1, v3 */
/* .line 32 */
v3 = java.lang.Math .max ( v1,p1 );
/* sub-int/2addr p2, v4 */
/* .line 33 */
p2 = java.lang.Math .max ( v1,p2 );
/* .line 34 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j()I
int v8 = 1; // const/4 v8, 0x1
/* if-ne v4, v8, :cond_1 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 35 */
} // :cond_0
v3 = java.lang.Math .max ( v7,p1 );
} // :cond_1
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 36 */
} // :cond_2
v7 = java.lang.Math .min ( v5,v3 );
} // :goto_0
/* move v3, v7 */
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 37 */
} // :cond_3
v2 = java.lang.Math .min ( v6,p2 );
} // :goto_2
/* aput v3, v0, v1 */
/* aput v2, v0, v8 */
} // .end method
public abstract Integer c ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
} // .end method
public Integer c ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.View c ( Integer p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
(( c.r.d.c ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c;->c(I)Landroid/view/View;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public android.view.View c ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroid/view/View;)Landroid/view/View;
/* if-nez p1, :cond_1 */
/* .line 3 */
} // :cond_1
v0 = this.a;
v0 = (( c.r.d.c ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c;->d(Landroid/view/View;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
} // .end method
public abstract androidx.recyclerview.widget.RecyclerView$p c ( ) {
} // .end method
public void c ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 20 */
v0 = this.b;
androidx.recyclerview.widget.RecyclerView .a ( v0,p1,p2 );
return;
} // .end method
public void c ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 4 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$p;)V
return;
} // .end method
public void c ( android.view.View p0, android.graphics.Rect p1 ) {
/* .locals 0 */
/* .line 19 */
androidx.recyclerview.widget.RecyclerView .a ( p1,p2 );
return;
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView$v p0 ) {
/* .locals 6 */
/* .line 6 */
v0 = (( androidx.recyclerview.widget.RecyclerView$v ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$v;->e()I
/* add-int/lit8 v1, v0, -0x1 */
} // :goto_0
/* if-ltz v1, :cond_3 */
/* .line 7 */
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).c ( v1 ); // invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->c(I)Landroid/view/View;
/* .line 8 */
androidx.recyclerview.widget.RecyclerView .l ( v2 );
/* .line 9 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).z ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
if ( v4 != null) { // if-eqz v4, :cond_0
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 10 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Z)V
/* .line 11 */
v5 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).t ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 12 */
v5 = this.b;
(( androidx.recyclerview.widget.RecyclerView ) v5 ).removeDetachedView ( v2, v4 ); // invoke-virtual {v5, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V
/* .line 13 */
} // :cond_1
v4 = this.b;
v4 = this.N;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 14 */
(( androidx.recyclerview.widget.RecyclerView$l ) v4 ).c ( v3 ); // invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$l;->c(Landroidx/recyclerview/widget/RecyclerView$d0;)V
} // :cond_2
int v4 = 1; // const/4 v4, 0x1
/* .line 15 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(Z)V
/* .line 16 */
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$v;->a(Landroid/view/View;)V
} // :goto_1
/* add-int/lit8 v1, v1, -0x1 */
/* .line 17 */
} // :cond_3
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$v;->c()V
/* if-lez v0, :cond_4 */
/* .line 18 */
p1 = this.b;
(( android.view.ViewGroup ) p1 ).invalidate ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V
} // :cond_4
return;
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
return;
} // .end method
public Integer d ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer d ( android.view.View p0 ) {
/* .locals 0 */
/* .line 14 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
p1 = this.b;
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
} // .end method
public abstract Integer d ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
} // .end method
public android.view.View d ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void d ( Integer p0 ) {
/* .locals 1 */
/* .line 12 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->d(I)V
} // :cond_0
return;
} // .end method
public void d ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.b;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).c ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->c(II)V
return;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, -0x80000000 */
/* const v3, 0x7fffffff */
/* const/high16 v3, -0x80000000 */
/* const v4, 0x7fffffff */
/* const v5, 0x7fffffff */
} // :goto_0
/* if-ge v1, v0, :cond_5 */
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 4 */
v7 = this.b;
v7 = this.j;
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 6 */
/* iget v6, v7, Landroid/graphics/Rect;->left:I */
/* if-ge v6, v4, :cond_1 */
/* move v4, v6 */
/* .line 7 */
} // :cond_1
/* iget v6, v7, Landroid/graphics/Rect;->right:I */
/* if-le v6, v2, :cond_2 */
/* move v2, v6 */
/* .line 8 */
} // :cond_2
/* iget v6, v7, Landroid/graphics/Rect;->top:I */
/* if-ge v6, v5, :cond_3 */
/* move v5, v6 */
/* .line 9 */
} // :cond_3
/* iget v6, v7, Landroid/graphics/Rect;->bottom:I */
/* if-le v6, v3, :cond_4 */
/* move v3, v6 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
/* .line 10 */
} // :cond_5
v0 = this.b;
v0 = this.j;
(( android.graphics.Rect ) v0 ).set ( v4, v5, v2, v3 ); // invoke-virtual {v0, v4, v5, v2, v3}, Landroid/graphics/Rect;->set(IIII)V
/* .line 11 */
v0 = this.b;
v0 = this.j;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/graphics/Rect;II)V
return;
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
return;
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
return;
} // .end method
public Boolean d ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.r.d.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/r/d/c;->a()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer e ( android.view.View p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->d(Landroid/view/View;)I
/* add-int/2addr v0, p1 */
} // .end method
public abstract Integer e ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
} // .end method
public void e ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).e ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->e(I)V
} // :cond_0
return;
} // .end method
public abstract void e ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
} // .end method
public void e ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 2 */
/* .line 5 */
v0 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
/* const/high16 v1, 0x40000000 # 2.0f */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v0,v1 );
/* .line 6 */
p1 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v1 );
/* .line 7 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->b(II)V
return;
} // .end method
public Integer f ( android.view.View p0 ) {
/* .locals 1 */
/* .line 12 */
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).k ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->k(Landroid/view/View;)I
/* sub-int/2addr v0, p1 */
} // .end method
public abstract Integer f ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
} // .end method
public void f ( Integer p0 ) {
/* .locals 0 */
return;
} // .end method
public void f ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
this.b = p1;
/* .line 2 */
this.a = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->p:I */
/* .line 4 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->q:I */
/* .line 5 */
} // :cond_0
this.b = p1;
/* .line 6 */
v0 = this.f;
this.a = v0;
/* .line 7 */
v0 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->p:I */
/* .line 8 */
p1 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->q:I */
} // :goto_0
/* const/high16 p1, 0x40000000 # 2.0f */
/* .line 9 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->n:I */
/* .line 10 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$o;->o:I */
return;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 11 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer g ( android.view.View p0 ) {
/* .locals 2 */
/* .line 6 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
v0 = this.b;
/* .line 7 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* iget v1, v0, Landroid/graphics/Rect;->top:I */
/* add-int/2addr p1, v1 */
/* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr p1, v0 */
} // .end method
public android.view.View g ( ) {
/* .locals 3 */
/* .line 3 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 4 */
} // :cond_0
(( android.view.ViewGroup ) v0 ).getFocusedChild ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
v2 = this.a;
v2 = (( c.r.d.c ) v2 ).d ( v0 ); // invoke-virtual {v2, v0}, Lc/r/d/c;->d(Landroid/view/View;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_1
} // :cond_2
} // :goto_0
} // .end method
public void g ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.a;
(( c.r.d.c ) v0 ).f ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c;->f(I)V
} // :cond_0
return;
} // .end method
public void g ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
return;
} // .end method
public Integer h ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->q:I */
} // .end method
public Integer h ( android.view.View p0 ) {
/* .locals 2 */
/* .line 2 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
v0 = this.b;
/* .line 3 */
p1 = (( android.view.View ) p1 ).getMeasuredWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
/* iget v1, v0, Landroid/graphics/Rect;->left:I */
/* add-int/2addr p1, v1 */
/* iget v0, v0, Landroid/graphics/Rect;->right:I */
/* add-int/2addr p1, v0 */
} // .end method
public Integer i ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->o:I */
} // .end method
public Integer i ( android.view.View p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = (( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->m(Landroid/view/View;)I
/* add-int/2addr v0, p1 */
} // .end method
public Integer j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = c.h.n.v0 .o ( v0 );
} // .end method
public Integer j ( android.view.View p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->n(Landroid/view/View;)I
/* sub-int/2addr v0, p1 */
} // .end method
public Integer k ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
v0 = c.h.n.v0 .p ( v0 );
} // .end method
public Integer k ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
p1 = this.b;
/* iget p1, p1, Landroid/graphics/Rect;->left:I */
} // .end method
public Integer l ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
v0 = c.h.n.v0 .q ( v0 );
} // .end method
public Integer l ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
p1 = (( androidx.recyclerview.widget.RecyclerView$p ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
} // .end method
public Integer m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.view.ViewGroup ) v0 ).getPaddingBottom ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingBottom()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer m ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
p1 = this.b;
/* iget p1, p1, Landroid/graphics/Rect;->right:I */
} // .end method
public Integer n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.view.ViewGroup ) v0 ).getPaddingLeft ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingLeft()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer n ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
p1 = this.b;
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
} // .end method
public Integer o ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.view.ViewGroup ) v0 ).getPaddingRight ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingRight()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void o ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.r.d.c ) v0 ).e ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/c;->e(Landroid/view/View;)V
return;
} // .end method
public Integer p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.view.ViewGroup ) v0 ).getPaddingTop ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingTop()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer q ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->p:I */
} // .end method
public Integer r ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->n:I */
} // .end method
public Boolean s ( ) {
/* .locals 5 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 4 */
/* iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* if-gez v4, :cond_0 */
/* iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* if-gez v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public Boolean t ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->i:Z */
} // .end method
public abstract Boolean u ( ) {
} // .end method
public final Boolean v ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->k:Z */
} // .end method
public Boolean w ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$z ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$z;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public abstract android.os.Parcelable x ( ) {
} // .end method
public void y ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V
} // :cond_0
return;
} // .end method
public void z ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$o;->h:Z */
return;
} // .end method
