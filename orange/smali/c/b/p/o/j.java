public class c.b.p.o.j extends android.widget.BaseAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 public final c.b.p.o.k c; //synthetic
	 /* # direct methods */
	 public c.b.p.o.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 2 */
		 /* iput p1, p0, Lc/b/p/o/j;->b:I */
		 /* .line 3 */
		 (( c.b.p.o.j ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/o/j;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = this.d;
		 (( c.b.p.o.m ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->f()Lc/b/p/o/p;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 v1 = this.c;
			 v1 = this.d;
			 (( c.b.p.o.m ) v1 ).j ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
			 /* .line 3 */
			 v2 = 			 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
			 int v3 = 0; // const/4 v3, 0x0
		 } // :goto_0
		 /* if-ge v3, v2, :cond_1 */
		 /* .line 4 */
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Lc/b/p/o/p; */
		 /* if-ne v4, v0, :cond_0 */
		 /* .line 5 */
		 /* iput v3, p0, Lc/b/p/o/j;->b:I */
		 return;
	 } // :cond_0
	 /* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
/* .line 6 */
/* iput v0, p0, Lc/b/p/o/j;->b:I */
return;
} // .end method
public Integer getCount ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
v0 = this.d;
(( c.b.p.o.m ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
/* .line 2 */
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
v1 = this.c;
/* iget v1, v1, Lc/b/p/o/k;->f:I */
/* sub-int/2addr v0, v1 */
/* .line 3 */
/* iget v1, p0, Lc/b/p/o/j;->b:I */
/* if-gez v1, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public c.b.p.o.p getItem ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.c;
v0 = this.d;
(( c.b.p.o.m ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
/* .line 3 */
v1 = this.c;
/* iget v1, v1, Lc/b/p/o/k;->f:I */
/* add-int/2addr p1, v1 */
/* .line 4 */
/* iget v1, p0, Lc/b/p/o/j;->b:I */
/* if-ltz v1, :cond_0 */
/* if-lt p1, v1, :cond_0 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 5 */
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Lc/b/p/o/p; */
} // .end method
public java.lang.Object getItem ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.j ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/j;->getItem(I)Lc/b/p/o/p;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p2, :cond_0 */
/* .line 1 */
p2 = this.c;
v1 = this.c;
/* iget p2, p2, Lc/b/p/o/k;->h:I */
(( android.view.LayoutInflater ) v1 ).inflate ( p2, p3, v0 ); // invoke-virtual {v1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* .line 2 */
} // :cond_0
/* move-object p3, p2 */
/* check-cast p3, Lc/b/p/o/a0$a; */
/* .line 3 */
(( c.b.p.o.j ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/j;->getItem(I)Lc/b/p/o/p;
} // .end method
public void notifyDataSetChanged ( ) {
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.j ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/o/j;->a()V
/* .line 2 */
/* invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V */
return;
} // .end method
