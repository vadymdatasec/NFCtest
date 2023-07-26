public abstract class androidx.recyclerview.widget.GridLayoutManager$c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/GridLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "c" */
} // .end annotation
/* # instance fields */
public final android.util.SparseIntArray a;
public final android.util.SparseIntArray b;
public Boolean c;
public Boolean d;
/* # direct methods */
public androidx.recyclerview.widget.GridLayoutManager$c ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Landroid/util/SparseIntArray; */
/* invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Landroid/util/SparseIntArray; */
/* invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V */
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$c;->c:Z */
/* .line 5 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$c;->d:Z */
return;
} // .end method
public static Integer a ( android.util.SparseIntArray p0, Integer p1 ) {
/* .locals 4 */
/* .line 7 */
v0 = (( android.util.SparseIntArray ) p0 ).size ( ); // invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I
/* add-int/lit8 v0, v0, -0x1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-gt v1, v0, :cond_1 */
/* add-int v2, v1, v0 */
/* ushr-int/lit8 v2, v2, 0x1 */
/* .line 8 */
v3 = (( android.util.SparseIntArray ) p0 ).keyAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/util/SparseIntArray;->keyAt(I)I
/* if-ge v3, p1, :cond_0 */
/* add-int/lit8 v2, v2, 0x1 */
/* move v1, v2 */
} // :cond_0
/* add-int/lit8 v2, v2, -0x1 */
/* move v0, v2 */
} // :cond_1
/* add-int/lit8 v1, v1, -0x1 */
/* if-ltz v1, :cond_2 */
/* .line 9 */
p1 = (( android.util.SparseIntArray ) p0 ).size ( ); // invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I
/* if-ge v1, p1, :cond_2 */
/* .line 10 */
p0 = (( android.util.SparseIntArray ) p0 ).keyAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/util/SparseIntArray;->keyAt(I)I
} // :cond_2
int p0 = -1; // const/4 p0, -0x1
} // .end method
/* # virtual methods */
public abstract Integer a ( Integer p0 ) {
} // .end method
public Integer a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$c;->d:Z */
/* if-nez v0, :cond_0 */
/* .line 3 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->c(II)I
/* .line 4 */
} // :cond_0
v0 = this.b;
int v1 = -1; // const/4 v1, -0x1
v0 = (( android.util.SparseIntArray ) v0 ).get ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I
/* if-eq v0, v1, :cond_1 */
/* .line 5 */
} // :cond_1
p2 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->c(II)I
/* .line 6 */
v0 = this.b;
(( android.util.SparseIntArray ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.util.SparseIntArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V
return;
} // .end method
public Integer b ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$c;->c:Z */
/* if-nez v0, :cond_0 */
/* .line 3 */
p1 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->d(II)I
/* .line 4 */
} // :cond_0
v0 = this.a;
int v1 = -1; // const/4 v1, -0x1
v0 = (( android.util.SparseIntArray ) v0 ).get ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I
/* if-eq v0, v1, :cond_1 */
/* .line 5 */
} // :cond_1
p2 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->d(II)I
/* .line 6 */
v0 = this.a;
(( android.util.SparseIntArray ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.util.SparseIntArray ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V
return;
} // .end method
public Integer c ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager$c;->d:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.b;
v0 = androidx.recyclerview.widget.GridLayoutManager$c .a ( v0,p1 );
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_0 */
/* .line 3 */
v2 = this.b;
v2 = (( android.util.SparseIntArray ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->get(I)I
/* add-int/lit8 v3, v0, 0x1 */
/* .line 4 */
v4 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).b ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->b(II)I
v0 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(I)I
/* add-int/2addr v4, v0 */
/* if-ne v4, p2, :cond_1 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
/* .line 5 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(I)I
} // :goto_1
/* if-ge v3, p1, :cond_4 */
/* .line 6 */
v5 = (( androidx.recyclerview.widget.GridLayoutManager$c ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/GridLayoutManager$c;->a(I)I
/* add-int/2addr v4, v5 */
/* if-ne v4, p2, :cond_2 */
/* add-int/lit8 v2, v2, 0x1 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_2
/* if-le v4, p2, :cond_3 */
/* add-int/lit8 v2, v2, 0x1 */
/* move v4, v5 */
} // :cond_3
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
/* add-int/2addr v4, v0 */
/* if-le v4, p2, :cond_5 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
} // .end method
public abstract Integer d ( Integer p0, Integer p1 ) {
} // .end method
