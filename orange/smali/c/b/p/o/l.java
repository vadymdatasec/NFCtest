public class c.b.p.o.l extends android.widget.BaseAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.b.p.o.m b;
	 public Integer c;
	 public Boolean d;
	 public final Boolean e;
	 public final android.view.LayoutInflater f;
	 public final Integer g;
	 /* # direct methods */
	 public c.b.p.o.l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lc/b/p/o/l;->c:I */
		 /* .line 3 */
		 /* iput-boolean p3, p0, Lc/b/p/o/l;->e:Z */
		 /* .line 4 */
		 this.f = p2;
		 /* .line 5 */
		 this.b = p1;
		 /* .line 6 */
		 /* iput p4, p0, Lc/b/p/o/l;->g:I */
		 /* .line 7 */
		 (( c.b.p.o.l ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/o/l;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 5 */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.p.o.m ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->f()Lc/b/p/o/p;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 3 */
			 v1 = this.b;
			 (( c.b.p.o.m ) v1 ).j ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
			 /* .line 4 */
			 v2 = 			 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
			 int v3 = 0; // const/4 v3, 0x0
		 } // :goto_0
		 /* if-ge v3, v2, :cond_1 */
		 /* .line 5 */
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Lc/b/p/o/p; */
		 /* if-ne v4, v0, :cond_0 */
		 /* .line 6 */
		 /* iput v3, p0, Lc/b/p/o/l;->c:I */
		 return;
	 } // :cond_0
	 /* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
/* .line 7 */
/* iput v0, p0, Lc/b/p/o/l;->c:I */
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/b/p/o/l;->d:Z */
return;
} // .end method
public c.b.p.o.m b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer getCount ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/p/o/l;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.b;
	 /* .line 2 */
	 (( c.b.p.o.m ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
} // :cond_0
v0 = this.b;
(( c.b.p.o.m ) v0 ).n ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->n()Ljava/util/ArrayList;
/* .line 3 */
} // :goto_0
/* iget v1, p0, Lc/b/p/o/l;->c:I */
/* if-gez v1, :cond_1 */
/* .line 4 */
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* .line 5 */
} // :cond_1
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public c.b.p.o.p getItem ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/p/o/l;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
/* .line 3 */
(( c.b.p.o.m ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
} // :cond_0
v0 = this.b;
(( c.b.p.o.m ) v0 ).n ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->n()Ljava/util/ArrayList;
/* .line 4 */
} // :goto_0
/* iget v1, p0, Lc/b/p/o/l;->c:I */
/* if-ltz v1, :cond_1 */
/* if-lt p1, v1, :cond_1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 5 */
} // :cond_1
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Lc/b/p/o/p; */
} // .end method
public java.lang.Object getItem ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.l ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p2, :cond_0 */
/* .line 1 */
p2 = this.f;
/* iget v1, p0, Lc/b/p/o/l;->g:I */
(( android.view.LayoutInflater ) p2 ).inflate ( v1, p3, v0 ); // invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* .line 2 */
} // :cond_0
(( c.b.p.o.l ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;
p3 = (( c.b.p.o.p ) p3 ).getGroupId ( ); // invoke-virtual {p3}, Lc/b/p/o/p;->getGroupId()I
/* add-int/lit8 v1, p1, -0x1 */
/* if-ltz v1, :cond_1 */
/* .line 3 */
(( c.b.p.o.l ) p0 ).getItem ( v1 ); // invoke-virtual {p0, v1}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;
v1 = (( c.b.p.o.p ) v1 ).getGroupId ( ); // invoke-virtual {v1}, Lc/b/p/o/p;->getGroupId()I
} // :cond_1
/* move v1, p3 */
/* .line 4 */
} // :goto_0
/* move-object v2, p2 */
/* check-cast v2, Landroidx/appcompat/view/menu/ListMenuItemView; */
v3 = this.b;
/* .line 5 */
v3 = (( c.b.p.o.m ) v3 ).o ( ); // invoke-virtual {v3}, Lc/b/p/o/m;->o()Z
int v4 = 1; // const/4 v4, 0x1
if ( v3 != null) { // if-eqz v3, :cond_2
/* if-eq p3, v1, :cond_2 */
int p3 = 1; // const/4 p3, 0x1
} // :cond_2
int p3 = 0; // const/4 p3, 0x0
} // :goto_1
(( androidx.appcompat.view.menu.ListMenuItemView ) v2 ).setGroupDividerEnabled ( p3 ); // invoke-virtual {v2, p3}, Landroidx/appcompat/view/menu/ListMenuItemView;->setGroupDividerEnabled(Z)V
/* .line 6 */
/* move-object p3, p2 */
/* check-cast p3, Lc/b/p/o/a0$a; */
/* .line 7 */
/* iget-boolean v1, p0, Lc/b/p/o/l;->d:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 8 */
(( androidx.appcompat.view.menu.ListMenuItemView ) v2 ).setForceShowIcon ( v4 ); // invoke-virtual {v2, v4}, Landroidx/appcompat/view/menu/ListMenuItemView;->setForceShowIcon(Z)V
/* .line 9 */
} // :cond_3
(( c.b.p.o.l ) p0 ).getItem ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;
} // .end method
public void notifyDataSetChanged ( ) {
/* .locals 0 */
/* .line 1 */
(( c.b.p.o.l ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/o/l;->a()V
/* .line 2 */
/* invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V */
return;
} // .end method
