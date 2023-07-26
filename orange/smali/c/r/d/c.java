public class c.r.d.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/r/d/c$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.r.d.c$a a;
public final c.r.d.b b;
public final java.util.List c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.r.d.c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
/* new-instance p1, Lc/r/d/b; */
/* invoke-direct {p1}, Lc/r/d/b;-><init>()V */
this.b = p1;
/* .line 4 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.c = p1;
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 2 */
/* .line 12 */
v0 = v0 = this.a;
v1 = v1 = this.c;
/* sub-int/2addr v0, v1 */
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 13 */
p1 = (( c.r.d.c ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->d(I)I
/* .line 14 */
v0 = this.b;
(( c.r.d.b ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/b;->d(I)Z
/* .line 15 */
v0 = this.a;
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 3 */
/* .line 16 */
v0 = v0 = this.a;
/* if-ltz v0, :cond_0 */
/* .line 17 */
v1 = this.b;
(( c.r.d.b ) v1 ).e ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/b;->e(I)V
/* .line 18 */
(( c.r.d.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->b(Landroid/view/View;)V
return;
/* .line 19 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "view is not a child, cannot hide "; // const-string v2, "view is not a child, cannot hide "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( android.view.View p0, Integer p1, android.view.ViewGroup$LayoutParams p2, Boolean p3 ) {
/* .locals 1 */
/* if-gez p2, :cond_0 */
/* .line 7 */
p2 = p2 = this.a;
/* .line 8 */
} // :cond_0
p2 = (( c.r.d.c ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Lc/r/d/c;->d(I)I
/* .line 9 */
} // :goto_0
v0 = this.b;
(( c.r.d.b ) v0 ).a ( p2, p4 ); // invoke-virtual {v0, p2, p4}, Lc/r/d/b;->a(IZ)V
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 10 */
(( c.r.d.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->b(Landroid/view/View;)V
/* .line 11 */
} // :cond_1
p4 = this.a;
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Boolean p2 ) {
/* .locals 1 */
/* if-gez p2, :cond_0 */
/* .line 2 */
p2 = p2 = this.a;
/* .line 3 */
} // :cond_0
p2 = (( c.r.d.c ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Lc/r/d/c;->d(I)I
/* .line 4 */
} // :goto_0
v0 = this.b;
(( c.r.d.b ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lc/r/d/b;->a(IZ)V
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 5 */
(( c.r.d.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->b(Landroid/view/View;)V
/* .line 6 */
} // :cond_1
p3 = this.a;
return;
} // .end method
public void a ( android.view.View p0, Boolean p1 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
(( c.r.d.c ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Lc/r/d/c;->a(Landroid/view/View;IZ)V
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 9 */
v0 = v0 = this.a;
} // .end method
public android.view.View b ( Integer p0 ) {
/* .locals 5 */
/* .line 3 */
v0 = v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 4 */
v2 = this.c;
/* check-cast v2, Landroid/view/View; */
/* .line 5 */
v3 = this.a;
/* .line 6 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).j ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I
/* if-ne v4, p1, :cond_0 */
/* .line 7 */
v4 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).p ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
/* if-nez v4, :cond_0 */
/* .line 8 */
v3 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v3 ).r ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
/* if-nez v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
/* .line 2 */
v0 = this.a;
return;
} // .end method
public Integer c ( android.view.View p0 ) {
/* .locals 2 */
/* .line 8 */
p1 = v0 = this.a;
int v0 = -1; // const/4 v0, -0x1
/* if-ne p1, v0, :cond_0 */
/* .line 9 */
} // :cond_0
v1 = this.b;
v1 = (( c.r.d.b ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/b;->c(I)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 10 */
} // :cond_1
v0 = this.b;
v0 = (( c.r.d.b ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/r/d/b;->b(I)I
/* sub-int/2addr p1, v0 */
} // .end method
public android.view.View c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = (( c.r.d.c ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->d(I)I
/* .line 2 */
v0 = this.a;
} // .end method
public void c ( ) {
/* .locals 3 */
/* .line 3 */
v0 = this.b;
(( c.r.d.b ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/b;->b()V
/* .line 4 */
v0 = v0 = this.c;
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 5 */
v1 = this.a;
v2 = this.c;
/* check-cast v2, Landroid/view/View; */
/* .line 6 */
v1 = this.c;
/* add-int/lit8 v0, v0, -0x1 */
/* .line 7 */
} // :cond_0
v0 = this.a;
return;
} // .end method
public final Integer d ( Integer p0 ) {
/* .locals 4 */
int v0 = -1; // const/4 v0, -0x1
/* if-gez p1, :cond_0 */
/* .line 1 */
} // :cond_0
v1 = v1 = this.a;
/* move v2, p1 */
} // :goto_0
/* if-ge v2, v1, :cond_3 */
/* .line 2 */
v3 = this.b;
v3 = (( c.r.d.b ) v3 ).b ( v2 ); // invoke-virtual {v3, v2}, Lc/r/d/b;->b(I)I
/* sub-int v3, v2, v3 */
/* sub-int v3, p1, v3 */
/* if-nez v3, :cond_2 */
/* .line 3 */
} // :goto_1
p1 = this.b;
p1 = (( c.r.d.b ) p1 ).c ( v2 ); // invoke-virtual {p1, v2}, Lc/r/d/b;->c(I)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // :cond_2
/* add-int/2addr v2, v3 */
} // :cond_3
} // .end method
public Boolean d ( android.view.View p0 ) {
/* .locals 1 */
/* .line 4 */
p1 = v0 = this.c;
} // .end method
public android.view.View e ( Integer p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
} // .end method
public void e ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.a;
/* if-gez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v1 = this.b;
v1 = (( c.r.d.b ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/b;->d(I)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
(( c.r.d.c ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->h(Landroid/view/View;)Z
/* .line 4 */
} // :cond_1
p1 = this.a;
return;
} // .end method
public void f ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
p1 = (( c.r.d.c ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->d(I)I
/* .line 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
v1 = this.b;
v1 = (( c.r.d.b ) v1 ).d ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/b;->d(I)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
(( c.r.d.c ) p0 ).h ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/c;->h(Landroid/view/View;)Z
/* .line 5 */
} // :cond_1
v0 = this.a;
return;
} // .end method
public Boolean f ( android.view.View p0 ) {
/* .locals 3 */
/* .line 6 */
v0 = v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_0 */
/* .line 7 */
(( c.r.d.c ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->h(Landroid/view/View;)Z
/* .line 8 */
} // :cond_0
v2 = this.b;
v2 = (( c.r.d.b ) v2 ).c ( v0 ); // invoke-virtual {v2, v0}, Lc/r/d/b;->c(I)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 9 */
v2 = this.b;
(( c.r.d.b ) v2 ).d ( v0 ); // invoke-virtual {v2, v0}, Lc/r/d/b;->d(I)Z
/* .line 10 */
(( c.r.d.c ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->h(Landroid/view/View;)Z
/* .line 11 */
p1 = this.a;
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void g ( android.view.View p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = v0 = this.a;
/* if-ltz v0, :cond_1 */
/* .line 2 */
v1 = this.b;
v1 = (( c.r.d.b ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/b;->c(I)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
v1 = this.b;
(( c.r.d.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/r/d/b;->a(I)V
/* .line 4 */
(( c.r.d.c ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/c;->h(Landroid/view/View;)Z
return;
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "trying to unhide a view that was not hidden"; // const-string v2, "trying to unhide a view that was not hidden"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "view is not a child, cannot hide "; // const-string v2, "view is not a child, cannot hide "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final Boolean h ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.a;
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.b;
(( c.r.d.b ) v1 ).toString ( ); // invoke-virtual {v1}, Lc/r/d/b;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", hidden list:"; // const-string v1, ", hidden list:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
