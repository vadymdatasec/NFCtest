public abstract class c.i.a.c extends android.widget.BaseAdapter implements android.widget.Filterable implements c.i.a.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Boolean b;
	 public Boolean c;
	 public android.database.Cursor d;
	 public android.content.Context e;
	 public Integer f;
	 public c.i.a.a g;
	 public android.database.DataSetObserver h;
	 public c.i.a.e i;
	 /* # direct methods */
	 public c.i.a.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 int p3 = 1; // const/4 p3, 0x1
		 } // :cond_0
		 int p3 = 2; // const/4 p3, 0x2
		 /* .line 2 */
	 } // :goto_0
	 (( c.i.a.c ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/i/a/c;->a(Landroid/content/Context;Landroid/database/Cursor;I)V
	 return;
} // .end method
/* # virtual methods */
public android.database.Cursor a ( ) {
	 /* .locals 1 */
	 /* .line 13 */
	 v0 = this.d;
} // .end method
public abstract android.view.View a ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
} // .end method
public abstract java.lang.CharSequence a ( android.database.Cursor p0 ) {
} // .end method
public void a ( android.content.Context p0, android.database.Cursor p1, Integer p2 ) {
	 /* .locals 3 */
	 /* and-int/lit8 v0, p3, 0x1 */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 /* if-ne v0, v2, :cond_0 */
	 /* or-int/lit8 p3, p3, 0x2 */
	 /* .line 1 */
	 /* iput-boolean v2, p0, Lc/i/a/c;->c:Z */
	 /* .line 2 */
} // :cond_0
/* iput-boolean v1, p0, Lc/i/a/c;->c:Z */
} // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
} // :cond_1
this.d = p2;
/* .line 4 */
/* iput-boolean v1, p0, Lc/i/a/c;->b:Z */
/* .line 5 */
this.e = p1;
if ( v1 != null) { // if-eqz v1, :cond_2
final String p1 = "_id"; // const-string p1, "_id"
p1 = /* .line 6 */
} // :cond_2
int p1 = -1; // const/4 p1, -0x1
} // :goto_1
/* iput p1, p0, Lc/i/a/c;->f:I */
int p1 = 2; // const/4 p1, 0x2
/* and-int/2addr p3, p1 */
/* if-ne p3, p1, :cond_3 */
/* .line 7 */
/* new-instance p1, Lc/i/a/a; */
/* invoke-direct {p1, p0}, Lc/i/a/a;-><init>(Lc/i/a/c;)V */
this.g = p1;
/* .line 8 */
/* new-instance p1, Lc/i/a/b; */
/* invoke-direct {p1, p0}, Lc/i/a/b;-><init>(Lc/i/a/c;)V */
this.h = p1;
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
this.g = p1;
/* .line 10 */
this.h = p1;
} // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 11 */
p1 = this.g;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 12 */
} // :cond_4
p1 = this.h;
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_5
return;
} // .end method
public abstract void a ( android.view.View p0, android.content.Context p1, android.database.Cursor p2 ) {
} // .end method
public abstract android.view.View b ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 3 */
/* iget-boolean v0, p0, Lc/i/a/c;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez v0, :cond_0 */
/* .line 4 */
v0 = v0 = this.d;
/* iput-boolean v0, p0, Lc/i/a/c;->b:Z */
} // :cond_0
return;
} // .end method
public void b ( android.database.Cursor p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.i.a.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/i/a/c;->c(Landroid/database/Cursor;)Landroid/database/Cursor;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
return;
} // .end method
public android.database.Cursor c ( android.database.Cursor p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
/* if-ne p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
} // :cond_1
v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 4 */
} // :cond_2
this.d = p1;
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 5 */
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 6 */
} // :cond_3
v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_4
} // :cond_4
final String v1 = "_id"; // const-string v1, "_id"
p1 = /* .line 7 */
/* iput p1, p0, Lc/i/a/c;->f:I */
int p1 = 1; // const/4 p1, 0x1
/* .line 8 */
/* iput-boolean p1, p0, Lc/i/a/c;->b:Z */
/* .line 9 */
(( android.widget.BaseAdapter ) p0 ).notifyDataSetChanged ( ); // invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
} // :cond_5
int p1 = -1; // const/4 p1, -0x1
/* .line 10 */
/* iput p1, p0, Lc/i/a/c;->f:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 11 */
/* iput-boolean p1, p0, Lc/i/a/c;->b:Z */
/* .line 12 */
(( android.widget.BaseAdapter ) p0 ).notifyDataSetInvalidated ( ); // invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V
} // :goto_0
} // .end method
public Integer getCount ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/i/a/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 2 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.view.View getDropDownView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/i/a/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.d;
/* if-nez p2, :cond_0 */
/* .line 3 */
p1 = this.e;
p2 = this.d;
(( c.i.a.c ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/i/a/c;->a(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
/* .line 4 */
} // :cond_0
p1 = this.e;
p3 = this.d;
(( c.i.a.c ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/i/a/c;->a(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.widget.Filter getFilter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/i/a/e; */
/* invoke-direct {v0, p0}, Lc/i/a/e;-><init>(Lc/i/a/d;)V */
this.i = v0;
/* .line 3 */
} // :cond_0
v0 = this.i;
} // .end method
public java.lang.Object getItem ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/i/a/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* .line 3 */
p1 = this.d;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/i/a/c;->b:Z */
/* const-wide/16 v1, 0x0 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* .line 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
p1 = this.d;
/* iget v0, p0, Lc/i/a/c;->f:I */
/* move-result-wide v0 */
/* return-wide v0 */
} // :cond_0
/* return-wide v1 */
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/i/a/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v0 = v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* if-nez p2, :cond_0 */
	 /* .line 3 */
	 p1 = this.e;
	 p2 = this.d;
	 (( c.i.a.c ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/i/a/c;->b(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
	 /* .line 4 */
} // :cond_0
p1 = this.e;
p3 = this.d;
(( c.i.a.c ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/i/a/c;->a(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
/* .line 5 */
} // :cond_1
/* new-instance p2, Ljava/lang/IllegalStateException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "couldn\'t move cursor to position "; // const-string v0, "couldn\'t move cursor to position "
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 6 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "this should only be called when the cursor is valid"; // const-string p2, "this should only be called when the cursor is valid"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
