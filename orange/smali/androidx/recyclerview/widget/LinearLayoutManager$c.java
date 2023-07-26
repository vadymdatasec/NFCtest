public class androidx.recyclerview.widget.LinearLayoutManager$c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/LinearLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "c" */
} // .end annotation
/* # instance fields */
public Boolean a;
public Integer b;
public Integer c;
public Integer d;
public Integer e;
public Integer f;
public Integer g;
public Integer h;
public Integer i;
public Boolean j;
public Integer k;
public java.util.List l;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean m;
/* # direct methods */
public androidx.recyclerview.widget.LinearLayoutManager$c ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a:Z */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->h:I */
/* .line 4 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->i:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
this.l = v0;
return;
} // .end method
/* # virtual methods */
public android.view.View a ( androidx.recyclerview.widget.RecyclerView$v p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( androidx.recyclerview.widget.LinearLayoutManager$c ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b()Landroid/view/View;
/* .line 4 */
} // :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->d(I)Landroid/view/View;
/* .line 5 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
} // .end method
public void a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
(( androidx.recyclerview.widget.LinearLayoutManager$c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroid/view/View;)V
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 7 */
(( androidx.recyclerview.widget.LinearLayoutManager$c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b(Landroid/view/View;)Landroid/view/View;
/* if-nez p1, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 8 */
/* iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* .line 9 */
} // :cond_0
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 10 */
p1 = (( androidx.recyclerview.widget.RecyclerView$p ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
/* iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
} // :goto_0
return;
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* if-ltz v0, :cond_0 */
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-ge v0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final android.view.View b ( ) {
/* .locals 5 */
/* .line 1 */
v0 = v0 = this.l;
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 2 */
v2 = this.l;
/* check-cast v2, Landroidx/recyclerview/widget/RecyclerView$d0; */
v2 = this.a;
/* .line 3 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/recyclerview/widget/RecyclerView$p; */
/* .line 4 */
v4 = (( androidx.recyclerview.widget.RecyclerView$p ) v3 ).c ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 5 */
} // :cond_0
/* iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
v3 = (( androidx.recyclerview.widget.RecyclerView$p ) v3 ).a ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
/* if-ne v4, v3, :cond_1 */
/* .line 6 */
(( androidx.recyclerview.widget.LinearLayoutManager$c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->a(Landroid/view/View;)V
} // :cond_1
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.View b ( android.view.View p0 ) {
/* .locals 7 */
/* .line 7 */
v0 = v0 = this.l;
int v1 = 0; // const/4 v1, 0x0
/* const v2, 0x7fffffff */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_4 */
/* .line 8 */
v4 = this.l;
/* check-cast v4, Landroidx/recyclerview/widget/RecyclerView$d0; */
v4 = this.a;
/* .line 9 */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroidx/recyclerview/widget/RecyclerView$p; */
/* if-eq v4, p1, :cond_3 */
/* .line 10 */
v6 = (( androidx.recyclerview.widget.RecyclerView$p ) v5 ).c ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 11 */
} // :cond_0
v5 = (( androidx.recyclerview.widget.RecyclerView$p ) v5 ).a ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
/* iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I */
/* sub-int/2addr v5, v6 */
/* iget v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I */
/* mul-int v5, v5, v6 */
/* if-gez v5, :cond_1 */
} // :cond_1
/* if-ge v5, v2, :cond_3 */
/* move-object v1, v4 */
/* if-nez v5, :cond_2 */
} // :cond_2
/* move v2, v5 */
} // :cond_3
} // :goto_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
} // :goto_2
} // .end method
