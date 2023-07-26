public class e.h.b.a.l.z0 extends android.widget.LinearLayout {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "ViewConstructor" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.String b;
public java.util.Date c;
/* # direct methods */
public e.h.b.a.l.z0 ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
	 /* const v0, 0x7f0b003e */
	 /* .line 2 */
	 android.view.View .inflate ( p1,v0,p0 );
	 /* .line 3 */
	 this.b = p2;
	 /* const p1, 0x7f08017e */
	 /* .line 4 */
	 (( e.h.b.a.l.z0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V
	 /* .line 5 */
	 /* new-instance p1, Ljava/util/Date; */
	 /* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
	 this.c = p1;
	 /* .line 6 */
	 (( e.h.b.a.l.z0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/l/z0;->a()V
	 return;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 4 */
	 /* .line 10 */
	 /* new-instance v0, Ljava/util/Date; */
	 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
	 (( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v0 */
	 v2 = this.c;
	 (( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v2 */
	 /* sub-long/2addr v0, v2 */
	 /* long-to-double v0, v0 */
	 /* const-wide v2, 0x408f400000000000L # 1000.0 */
	 /* div-double/2addr v0, v2 */
	 java.lang.Math .round ( v0,v1 );
	 /* move-result-wide v0 */
	 /* .line 11 */
	 (( android.widget.LinearLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;
	 int v3 = 1; // const/4 v3, 0x1
	 /* new-array v3, v3, [Ljava/lang/Object; */
	 java.lang.Long .valueOf ( v0,v1 );
	 int v1 = 0; // const/4 v1, 0x0
	 /* aput-object v0, v3, v1 */
	 /* const v0, 0x7f0e00c5 */
	 (( android.content.res.Resources ) v2 ).getString ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
	 /* const v1, 0x7f080180 */
	 /* .line 12 */
	 (( e.h.b.a.l.z0 ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V
	 return;
} // .end method
public final void a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 7 */
	 (( android.widget.LinearLayout ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/widget/TextView; */
	 /* .line 8 */
	 (( android.widget.LinearLayout ) p0 ).removeView ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
	 /* const/16 v0, 0x8 */
	 /* .line 9 */
	 (( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
	 return;
} // .end method
public void a ( Integer p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 java.lang.String .valueOf ( p1 );
	 /* const v0, 0x7f080183 */
	 (( e.h.b.a.l.z0 ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V
	 /* .line 3 */
	 /* new-instance p1, Ljava/util/Date; */
	 /* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
	 this.c = p1;
	 /* .line 4 */
	 (( e.h.b.a.l.z0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/l/z0;->a()V
	 /* const p1, 0x7f080184 */
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 5 */
		 (( e.h.b.a.l.z0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/l/z0;->b(ILjava/lang/String;)V
		 /* .line 6 */
	 } // :cond_0
	 (( e.h.b.a.l.z0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/l/z0;->a(I)V
} // :goto_0
return;
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
p1 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public final void b ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.LinearLayout ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/TextView; */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 3 */
(( android.widget.TextView ) p1 ).setText ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
return;
} // .end method
