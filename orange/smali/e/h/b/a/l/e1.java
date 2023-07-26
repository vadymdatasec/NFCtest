public class e.h.b.a.l.e1 extends android.widget.LinearLayout {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "ViewConstructor" */
	 /* } */
} // .end annotation
/* # instance fields */
public final fr.mbs.binary.Octets b;
public final fr.mbs.binary.Octets c;
public final android.view.ViewGroup d;
/* # direct methods */
public e.h.b.a.l.e1 ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
	 /* const v0, 0x7f0b006e */
	 /* .line 2 */
	 android.view.View .inflate ( p1,v0,p0 );
	 /* .line 3 */
	 this.b = p2;
	 /* .line 4 */
	 this.c = p3;
	 /* const p1, 0x7f0800d7 */
	 /* .line 5 */
	 (( android.widget.LinearLayout ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/view/ViewGroup; */
	 this.d = p1;
	 /* const p1, 0x7f080188 */
	 /* .line 6 */
	 (( android.widget.LinearLayout ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
	 /* check-cast p1, Landroid/widget/TextView; */
	 /* add-int/2addr p6, p5 */
	 /* const/16 p2, -0x7f */
	 /* .line 7 */
	 p2 = 	 java.lang.Math .max ( p6,p2 );
	 /* .line 8 */
	 (( android.widget.LinearLayout ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;
	 int p6 = 3; // const/4 p6, 0x3
	 /* new-array p6, p6, [Ljava/lang/Object; */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aput-object p4, p6, v0 */
	 java.lang.Byte .valueOf ( p5 );
	 int p5 = 1; // const/4 p5, 0x1
	 /* aput-object p4, p6, p5 */
	 java.lang.Integer .valueOf ( p2 );
	 int p4 = 2; // const/4 p4, 0x2
	 /* aput-object p2, p6, p4 */
	 /* const p2, 0x7f0e0182 */
	 (( android.content.res.Resources ) p3 ).getString ( p2, p6 ); // invoke-virtual {p3, p2, p6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
	 /* .line 9 */
	 (( android.widget.TextView ) p1 ).setText ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 return;
} // .end method
/* # virtual methods */
public final e.h.b.a.l.z0 a ( android.view.ViewGroup p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 6 */
} // :goto_0
v1 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_1 */
/* .line 7 */
(( android.view.ViewGroup ) p1 ).getChildAt ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* check-cast v1, Le/h/b/a/l/z0; */
/* .line 8 */
v2 = (( e.h.b.a.l.z0 ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Le/h/b/a/l/z0;->a(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
} // :goto_0
v1 = this.d;
v1 = (( android.view.ViewGroup ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_0 */
/* .line 10 */
v1 = this.d;
(( android.view.ViewGroup ) v1 ).getChildAt ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* check-cast v1, Le/h/b/a/l/z0; */
/* .line 11 */
(( e.h.b.a.l.z0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/b/a/l/z0;->a()V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void a ( java.lang.String p0, Integer p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.d;
(( e.h.b.a.l.e1 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/h/b/a/l/e1;->a(Landroid/view/ViewGroup;Ljava/lang/String;)Le/h/b/a/l/z0;
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Le/h/b/a/l/z0; */
(( android.widget.LinearLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Le/h/b/a/l/z0;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
/* .line 4 */
p1 = this.d;
(( android.view.ViewGroup ) p1 ).addView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 5 */
} // :cond_0
(( e.h.b.a.l.z0 ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Le/h/b/a/l/z0;->a(ILjava/lang/String;)V
return;
} // .end method
public Boolean a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
p1 = (( fr.mbs.binary.Octets ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.c;
p1 = (( fr.mbs.binary.Octets ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
