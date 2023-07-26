public abstract class e.h.b.a.l.d1 extends e.h.b.a.l.t0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.widget.LinearLayout t;
	 public android.content.BroadcastReceiver u;
	 /* # direct methods */
	 public e.h.b.a.l.d1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/b/a/l/t0;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/h/b/a/l/c1; */
		 /* invoke-direct {v0, p0}, Le/h/b/a/l/c1;-><init>(Le/h/b/a/l/d1;)V */
		 this.u = v0;
		 return;
	 } // .end method
	 public static void a ( e.h.b.a.l.d1 p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.b.a.l.d1 ) p0 ).u ( ); // invoke-virtual {p0}, Le/h/b/a/l/d1;->u()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract android.view.View a ( android.view.LayoutInflater p0, Integer p1, Integer p2, com.orange.oab.contactless.packid.domain.Transaction p3 ) {
	 } // .end method
	 public android.view.View a ( android.view.LayoutInflater p0, com.orange.oab.contactless.packid.domain.Transaction p1, Integer p2 ) {
		 /* .locals 4 */
		 /* .line 6 */
		 v0 = 		 (( e.h.b.a.l.d1 ) p0 ).t ( ); // invoke-virtual {p0}, Le/h/b/a/l/d1;->t()I
		 /* const v1, 0x7f080187 */
		 (( e.h.b.a.l.d1 ) p0 ).a ( p1, v0, v1, p2 ); // invoke-virtual {p0, p1, v0, v1, p2}, Le/h/b/a/l/d1;->a(Landroid/view/LayoutInflater;IILcom/orange/oab/contactless/packid/domain/Transaction;)Landroid/view/View;
		 /* const v0, 0x7f08017d */
		 /* .line 7 */
		 (( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 /* const v1, 0x7f0e0085 */
		 /* .line 8 */
		 (( android.app.Activity ) p0 ).getText ( v1 ); // invoke-virtual {p0, v1}, Landroid/app/Activity;->getText(I)Ljava/lang/CharSequence;
		 /* .line 9 */
		 /* new-instance v2, Ljava/text/SimpleDateFormat; */
		 java.util.Locale .getDefault ( );
		 /* invoke-direct {v2, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
		 (( com.orange.oab.contactless.packid.domain.Transaction ) p2 ).getDate ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDate()Ljava/util/Date;
		 (( java.text.SimpleDateFormat ) v2 ).format ( p2 ); // invoke-virtual {v2, p2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
		 (( android.widget.TextView ) v0 ).setText ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 10 */
		 /* rem-int/lit8 p3, p3, 0x2 */
		 /* if-nez p3, :cond_0 */
		 /* const p2, 0x7f0500ae */
		 /* .line 11 */
		 p2 = 		 c.h.f.f .a ( p0,p2 );
		 (( android.view.View ) p1 ).setBackgroundColor ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V
	 } // :cond_0
	 /* const p2, 0x7f05005d */
	 /* .line 12 */
	 p2 = 	 c.h.f.f .a ( p0,p2 );
	 (( android.view.View ) p1 ).setBackgroundColor ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V
} // :goto_0
} // .end method
public final void a ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/domain/Transaction;", */
/* ">;)V" */
/* } */
} // .end annotation
final String v0 = "layout_inflater"; // const-string v0, "layout_inflater"
/* .line 2 */
(( android.app.Activity ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/LayoutInflater; */
/* .line 3 */
v1 = this.t;
(( android.widget.LinearLayout ) v1 ).removeAllViewsInLayout ( ); // invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViewsInLayout()V
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
v2 = } // :goto_0
/* if-ge v1, v2, :cond_0 */
/* .line 5 */
v2 = this.t;
/* check-cast v3, Lcom/orange/oab/contactless/packid/domain/Transaction; */
(( e.h.b.a.l.d1 ) p0 ).a ( v0, v3, v1 ); // invoke-virtual {p0, v0, v3, v1}, Le/h/b/a/l/d1;->a(Landroid/view/LayoutInflater;Lcom/orange/oab/contactless/packid/domain/Transaction;I)Landroid/view/View;
(( android.widget.LinearLayout ) v2 ).addView ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public abstract void b ( Object p0 ) {
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Le/h/b/a/l/t0;->onCreate(Landroid/os/Bundle;)V */
/* const p1, 0x7f0800d8 */
/* .line 2 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroid/widget/LinearLayout; */
this.t = p1;
return;
} // .end method
public void onPause ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onPause()V */
/* .line 2 */
c.p.a.d .a ( p0 );
v1 = this.u;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
return;
} // .end method
public void onResume ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onResume()V */
/* .line 2 */
c.p.a.d .a ( p0 );
v1 = this.u;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 3 */
(( e.h.b.a.l.d1 ) p0 ).u ( ); // invoke-virtual {p0}, Le/h/b/a/l/d1;->u()V
return;
} // .end method
public abstract Integer t ( ) {
} // .end method
public final void u ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.b.a.m.d ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
/* .line 3 */
v1 = this.s;
(( e.h.b.a.l.d1 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/h/b/a/l/d1;->b(Le/h/b/a/m/d;)V
/* .line 4 */
/* new-instance v1, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v1 ).findTransactionsByZoneId ( v0 ); // invoke-virtual {v1, v0}, Lcom/orange/business/packid/android/lib/PackId;->findTransactionsByZoneId(Lfr/mbs/binary/Octets;)Ljava/util/List;
(( e.h.b.a.l.d1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/l/d1;->a(Ljava/util/List;)V
} // :cond_0
return;
} // .end method
