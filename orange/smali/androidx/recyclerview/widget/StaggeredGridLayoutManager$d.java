public class androidx.recyclerview.widget.StaggeredGridLayoutManager$d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "d" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* } */
} // .end annotation
/* # instance fields */
public a;
public java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public androidx.recyclerview.widget.StaggeredGridLayoutManager$d ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a a ( Integer p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 5 */
/* .line 27 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 28 */
v0 = } // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_4 */
/* .line 29 */
v3 = this.b;
/* check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 30 */
/* iget v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-lt v4, p2, :cond_1 */
} // :cond_1
/* if-lt v4, p1, :cond_3 */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 31 */
/* iget v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
/* if-eq v4, p3, :cond_2 */
if ( p4 != null) { // if-eqz p4, :cond_3
/* iget-boolean v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->e:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
} // :cond_2
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 10 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = -1; // const/4 v1, -0x1
/* .line 11 */
java.util.Arrays .fill ( v0,v1 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
this.b = v0;
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 4 */
/* .line 3 */
v0 = this.a;
int v1 = -1; // const/4 v1, -0x1
/* if-nez v0, :cond_0 */
/* const/16 v0, 0xa */
/* .line 4 */
p1 = java.lang.Math .max ( p1,v0 );
/* add-int/lit8 p1, p1, 0x1 */
/* new-array p1, p1, [I */
this.a = p1;
/* .line 5 */
java.util.Arrays .fill ( p1,v1 );
/* .line 6 */
} // :cond_0
/* array-length v2, v0 */
/* if-lt p1, v2, :cond_1 */
/* .line 7 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->g(I)I
/* new-array p1, p1, [I */
this.a = p1;
/* .line 8 */
/* array-length v2, v0 */
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( v0,v3,p1,v3,v2 );
/* .line 9 */
p1 = this.a;
/* array-length v0, v0 */
/* array-length v2, p1 */
java.util.Arrays .fill ( p1,v0,v2,v1 );
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 13 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v0, v0 */
/* if-lt p1, v0, :cond_0 */
} // :cond_0
/* add-int v0, p1, p2 */
/* .line 14 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(I)V
/* .line 15 */
v1 = this.a;
/* array-length v2, v1 */
/* sub-int/2addr v2, p1 */
/* sub-int/2addr v2, p2 */
java.lang.System .arraycopy ( v1,p1,v1,v0,v2 );
/* .line 16 */
v1 = this.a;
int v2 = -1; // const/4 v2, -0x1
java.util.Arrays .fill ( v1,p1,v0,v2 );
/* .line 17 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->c(II)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( Integer p0, androidx.recyclerview.widget.StaggeredGridLayoutManager$f p1 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(I)V
/* .line 2 */
v0 = this.a;
/* iget p2, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* aput p2, v0, p1 */
return;
} // .end method
public void a ( androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a p0 ) {
/* .locals 5 */
/* .line 18 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 19 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 20 */
} // :cond_0
v0 = v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_3 */
/* .line 21 */
v2 = this.b;
/* check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 22 */
/* iget v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* iget v4, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-ne v3, v4, :cond_1 */
/* .line 23 */
v3 = this.b;
/* .line 24 */
} // :cond_1
/* iget v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* iget v3, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-lt v2, v3, :cond_2 */
/* .line 25 */
v0 = this.b;
return;
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 26 */
} // :cond_3
v0 = this.b;
return;
} // .end method
public Integer b ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* .line 2 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 3 */
v1 = this.b;
/* check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 4 */
/* iget v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-lt v1, p1, :cond_0 */
/* .line 5 */
v1 = this.b;
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
/* .line 6 */
} // :cond_1
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->e(I)I
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .line 7 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v0, v0 */
/* if-lt p1, v0, :cond_0 */
} // :cond_0
/* add-int v0, p1, p2 */
/* .line 8 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(I)V
/* .line 9 */
v1 = this.a;
/* array-length v2, v1 */
/* sub-int/2addr v2, p1 */
/* sub-int/2addr v2, p2 */
java.lang.System .arraycopy ( v1,v0,v1,p1,v2 );
/* .line 10 */
v0 = this.a;
/* array-length v1, v0 */
/* sub-int/2addr v1, p2 */
/* array-length v2, v0 */
int v3 = -1; // const/4 v3, -0x1
java.util.Arrays .fill ( v0,v1,v2,v3 );
/* .line 11 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->d(II)V
} // :cond_1
} // :goto_0
return;
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a c ( Integer p0 ) {
/* .locals 4 */
/* .line 6 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 7 */
v0 = } // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_2 */
/* .line 8 */
v2 = this.b;
/* check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 9 */
/* iget v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-ne v3, p1, :cond_1 */
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_2
} // .end method
public final void c ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
v0 = } // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_2 */
/* .line 3 */
v1 = this.b;
/* check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 4 */
/* iget v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-ge v2, p1, :cond_1 */
} // :cond_1
/* add-int/2addr v2, p2 */
/* .line 5 */
/* iput v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
} // :goto_1
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_2
return;
} // .end method
public Integer d ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v1, v0 */
/* if-lt p1, v1, :cond_0 */
/* .line 2 */
} // :cond_0
/* aget p1, v0, p1 */
} // :cond_1
} // :goto_0
int p1 = -1; // const/4 p1, -0x1
} // .end method
public final void d ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .line 3 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
/* add-int v1, p1, p2 */
v0 = /* .line 4 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_3 */
/* .line 5 */
v2 = this.b;
/* check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 6 */
/* iget v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-ge v3, p1, :cond_1 */
} // :cond_1
/* if-ge v3, v1, :cond_2 */
/* .line 7 */
v2 = this.b;
} // :cond_2
/* sub-int/2addr v3, p2 */
/* .line 8 */
/* iput v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
} // :goto_1
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_3
return;
} // .end method
public Integer e ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
int v1 = -1; // const/4 v1, -0x1
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* array-length v0, v0 */
/* if-lt p1, v0, :cond_1 */
/* .line 3 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->f(I)I
/* if-ne v0, v1, :cond_2 */
/* .line 4 */
v0 = this.a;
/* array-length v2, v0 */
java.util.Arrays .fill ( v0,p1,v2,v1 );
/* .line 5 */
p1 = this.a;
/* array-length p1, p1 */
/* .line 6 */
} // :cond_2
v2 = this.a;
/* add-int/lit8 v0, v0, 0x1 */
java.util.Arrays .fill ( v2,p1,v0,v1 );
} // .end method
public final Integer f ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
int v1 = -1; // const/4 v1, -0x1
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->c(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v2 = this.b;
/* .line 4 */
} // :cond_1
v0 = v0 = this.b;
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_3 */
/* .line 5 */
v3 = this.b;
/* check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 6 */
/* iget v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* if-lt v3, p1, :cond_2 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
int v2 = -1; // const/4 v2, -0x1
} // :goto_1
/* if-eq v2, v1, :cond_4 */
/* .line 7 */
p1 = this.b;
/* check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 8 */
v0 = this.b;
/* .line 9 */
/* iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
} // :cond_4
} // .end method
public Integer g ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* array-length v0, v0 */
} // :goto_0
/* if-gt v0, p1, :cond_0 */
/* mul-int/lit8 v0, v0, 0x2 */
} // :cond_0
} // .end method
