public class androidx.recyclerview.widget.StaggeredGridLayoutManager$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
public Boolean c;
public Boolean d;
public Boolean e;
public f;
public final androidx.recyclerview.widget.StaggeredGridLayoutManager g; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.StaggeredGridLayoutManager$b ( ) {
/* .locals 0 */
/* .line 1 */
this.g = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b()V
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .line 5 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.g;
	 v0 = this.t;
	 v0 = 	 (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
} // :cond_0
v0 = this.g;
v0 = this.t;
/* .line 6 */
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
} // :goto_0
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 7 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
v0 = this.g;
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
/* sub-int/2addr v0, p1 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 9 */
} // :cond_0
v0 = this.g;
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* add-int/2addr v0, p1 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
} // :goto_0
return;
} // .end method
public void a ( androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] p0 ) {
/* .locals 5 */
/* .line 1 */
/* array-length v0, p1 */
/* .line 2 */
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_0
/* array-length v1, v1 */
/* if-ge v1, v0, :cond_1 */
/* .line 3 */
} // :cond_0
v1 = this.g;
v1 = this.s;
/* array-length v1, v1 */
/* new-array v1, v1, [I */
this.f = v1;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 4 */
v2 = this.f;
/* aget-object v3, p1, v1 */
/* const/high16 v4, -0x80000000 */
v3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v3 ).b ( v4 ); // invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* aput v3, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public void b ( ) {
/* .locals 2 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* const/high16 v1, -0x80000000 */
/* .line 2 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* .line 4 */
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->d:Z */
/* .line 5 */
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->e:Z */
/* .line 6 */
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
java.util.Arrays .fill ( v1,v0 );
} // :cond_0
return;
} // .end method
