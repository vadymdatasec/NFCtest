public class e.h.b.a.m.d implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final fr.mbs.binary.Octets C;
	 /* # instance fields */
	 public Boolean A;
	 public Boolean B;
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b;
	 public com.orange.oab.contactless.packid.ContactlessType c;
	 public java.lang.String d;
	 public fr.mbs.binary.Octets e;
	 public Boolean f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public e.h.b.a.p.i i;
	 public Boolean j;
	 public fr.mbs.binary.Octets k;
	 public Boolean l;
	 public Boolean m;
	 public com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus n;
	 public com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction o;
	 public Boolean p;
	 public Boolean q;
	 public java.lang.String r;
	 public e.h.b.a.m.i s;
	 public java.lang.String t;
	 public Boolean u;
	 public com.orange.oab.contactless.packid.hce.user.wallet.Tenant v;
	 public Boolean w;
	 public Boolean x;
	 public final e.h.b.a.m.a y;
	 public com.orange.oab.contactless.packid.rssi.RssiLevel z;
	 /* # direct methods */
	 public static e.h.b.a.m.d ( ) {
		 /* .locals 1 */
		 final String v0 = "534f474550BB"; // const-string v0, "534f474550BB"
		 /* .line 1 */
		 fr.mbs.binary.Octets .createOctets ( v0 );
		 return;
	 } // .end method
	 public e.h.b.a.m.d ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 v0 = e.h.b.a.m.c.d;
		 /* .line 3 */
		 v0 = e.h.b.a.m.i.d;
		 this.s = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->w:Z */
		 /* .line 5 */
		 v1 = com.orange.oab.contactless.packid.rssi.RssiLevel.ZERO;
		 this.z = v1;
		 /* .line 6 */
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->B:Z */
		 /* .line 7 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
		 this.d = v0;
		 /* .line 8 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 this.e = v0;
		 /* .line 9 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isActive ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isActive()Z
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->f:Z */
		 /* .line 10 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isTransactionAllowed ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isTransactionAllowed()Z
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->j:Z */
		 /* .line 11 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
		 this.k = v0;
		 /* .line 12 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isToken ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->l:Z */
		 /* .line 13 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isDefault ( p3 ); // invoke-virtual {p1, p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isDefault(Landroid/content/Context;)Z
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->m:Z */
		 /* .line 14 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getStatus ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getStatus()Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
		 this.n = v0;
		 /* .line 15 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getConditionToBeginTransaction ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
		 this.o = v0;
		 /* .line 16 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isManualConnectionAllowed ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isManualConnectionAllowed()Z
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->p:Z */
		 /* .line 17 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isNfcOnly ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->q:Z */
		 /* .line 18 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getTenant ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
		 this.v = v0;
		 /* .line 19 */
		 v0 = e.h.b.a.m.a.b;
		 this.y = v0;
		 /* .line 20 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getLogoFile ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getLogoFile()Ljava/lang/String;
		 this.h = v0;
		 /* .line 21 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getMaskedId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;
		 this.g = v0;
		 /* .line 22 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactLessType ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;
		 this.c = v0;
		 /* .line 23 */
		 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
		 /* invoke-direct {v0, p3}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
		 p2 = 		 (( com.orange.business.packid.android.lib.PackId ) v0 ).forceStatusUpdateForBadge ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/orange/business/packid/android/lib/PackId;->forceStatusUpdateForBadge(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)Z
		 /* iput-boolean p2, p0, Le/h/b/a/m/d;->x:Z */
		 /* .line 24 */
		 p2 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isLockable ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isLockable()Z
		 /* iput-boolean p2, p0, Le/h/b/a/m/d;->A:Z */
		 /* .line 25 */
		 p2 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isLocked ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isLocked()Z
		 /* iput-boolean p2, p0, Le/h/b/a/m/d;->B:Z */
		 /* .line 26 */
		 this.b = p1;
		 /* .line 27 */
		 (( e.h.b.a.m.d ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/h/b/a/m/d;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/content/Context;)V
		 return;
	 } // .end method
	 public e.h.b.a.m.d ( ) {
		 /* .locals 2 */
		 /* .line 28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 29 */
		 v0 = e.h.b.a.m.c.d;
		 /* .line 30 */
		 v0 = e.h.b.a.m.i.d;
		 this.s = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 31 */
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->w:Z */
		 /* .line 32 */
		 v1 = com.orange.oab.contactless.packid.rssi.RssiLevel.ZERO;
		 this.z = v1;
		 /* .line 33 */
		 /* iput-boolean v0, p0, Le/h/b/a/m/d;->B:Z */
		 /* .line 34 */
		 this.v = p1;
		 /* .line 35 */
		 this.k = p2;
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 36 */
			 p1 = e.h.b.a.m.a.c;
			 this.y = p1;
			 /* .line 37 */
		 } // :cond_0
		 p1 = e.h.b.a.m.a.d;
		 this.y = p1;
	 } // :goto_0
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 38 */
	 this.b = p1;
	 return;
} // .end method
/* # virtual methods */
public final Boolean A ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Le/h/b/a/m/d;->l:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* iget-boolean v0, p0, Le/h/b/a/m/d;->f:Z */
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.n;
	 v1 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
	 v0 = 	 (( java.lang.Enum ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
	 /* if-nez v0, :cond_2 */
	 v0 = this.n;
	 v1 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLING;
	 v0 = 	 (( java.lang.Enum ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean B ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->j:Z */
} // .end method
public final Integer a ( android.widget.ImageView p0 ) {
/* .locals 3 */
/* .line 4 */
v0 = this.h;
/* if-nez v0, :cond_0 */
final String v0 = "connection"; // const-string v0, "connection"
/* .line 5 */
} // :cond_0
(( android.widget.ImageView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;
/* .line 6 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v2 = "drawable"; // const-string v2, "drawable"
p1 = (( android.content.res.Resources ) v1 ).getIdentifier ( v0, v2, p1 ); // invoke-virtual {v1, v0, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // .end method
public fr.mbs.binary.Octets a ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.e;
} // .end method
public void a ( android.widget.TextView p0 ) {
/* .locals 2 */
/* .line 7 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->l:Z */
/* if-nez v0, :cond_1 */
v0 = this.n;
v1 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
/* if-eq v0, v1, :cond_0 */
} // :cond_0
/* const/16 v0, 0x8 */
/* .line 8 */
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_1
} // :goto_0
int v0 = 2; // const/4 v0, 0x2
/* const/high16 v1, 0x41600000 # 14.0f */
/* .line 9 */
(( android.widget.TextView ) p1 ).setTextSize ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V
/* .line 10 */
(( android.widget.TextView ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;
/* const v1, 0x7f05001f */
v0 = (( android.content.res.Resources ) v0 ).getColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
(( android.widget.TextView ) p1 ).setTextColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
(( android.widget.TextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 12 */
} // :goto_1
(( android.widget.TextView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = (( e.h.b.a.m.d ) p0 ).m ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->m()I
(( android.content.res.Resources ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( android.widget.TextView ) p1 ).setText ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 13 */
(( android.widget.TextView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
v1 = (( e.h.b.a.m.d ) p0 ).l ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->l()I
v0 = c.h.f.f .a ( v0,v1 );
(( android.widget.TextView ) p1 ).setTextColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, android.content.Context p1 ) {
/* .locals 1 */
/* .line 1 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isDefault ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isDefault(Landroid/content/Context;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
/* new-instance p2, Ljava/math/BigInteger; */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getMaskedId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;
/* const/16 v0, 0x10 */
/* invoke-direct {p2, p1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V */
(( java.math.BigInteger ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/math/BigInteger;->toString()Ljava/lang/String;
this.r = p1;
} // :cond_0
return;
} // .end method
public void a ( com.orange.oab.contactless.packid.rssi.RssiLevel p0 ) {
/* .locals 0 */
/* .line 16 */
this.z = p1;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 15 */
this.s = p1;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 18 */
this.i = p1;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 17 */
/* iput-boolean p1, p0, Le/h/b/a/m/d;->x:Z */
return;
} // .end method
public Boolean a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 19 */
v0 = this.b;
p1 = com.orange.business.packid.android.lib.PackIdUtility .canUseBleForBadge ( p1,v0 );
} // .end method
public final Boolean a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 14 */
v0 = this.d;
v1 = java.util.Locale.FRENCH;
(( java.lang.String ) v0 ).toLowerCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
v1 = java.util.Locale.FRENCH;
(( java.lang.String ) p1 ).toLowerCase ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
p1 = (( java.lang.String ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 10 */
v0 = this.d;
} // .end method
public final void b ( android.widget.ImageView p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( e.h.b.a.m.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/m/d;->a(Landroid/widget/ImageView;)I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
e.h.b.a.d .a ( p1 );
/* .line 3 */
java.lang.Integer .valueOf ( v0 );
(( e.h.b.a.g ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/h/b/a/g;->a(Ljava/lang/Integer;)Le/h/b/a/f;
/* .line 4 */
(( e.h.b.a.f ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/b/a/f;->b()Le/h/b/a/f;
/* const v1, 0x7f07008e */
/* .line 5 */
(( e.h.b.a.f ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;
/* .line 6 */
(( e.b.a.s ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;
} // :cond_0
return;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 8 */
this.t = p1;
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
/* .line 7 */
/* iput-boolean p1, p0, Le/h/b/a/m/d;->u:Z */
return;
} // .end method
public Boolean b ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 9 */
v0 = this.b;
p1 = com.orange.business.packid.android.lib.PackIdUtility .canUseNfcForBadge ( p1,v0 );
} // .end method
public com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction c ( ) {
/* .locals 1 */
/* .line 7 */
v0 = this.o;
} // .end method
public final void c ( android.widget.ImageView p0 ) {
/* .locals 2 */
/* .line 1 */
e.h.b.a.d .a ( p1 );
v1 = this.h;
/* .line 2 */
android.net.Uri .parse ( v1 );
(( e.h.b.a.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/g;->a(Landroid/net/Uri;)Le/h/b/a/f;
/* .line 3 */
(( e.h.b.a.f ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/b/a/f;->b()Le/h/b/a/f;
v1 = e.b.a.y.x.c0.c;
/* .line 4 */
(( e.h.b.a.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/f;->a(Le/b/a/y/x/c0;)Le/h/b/a/f;
/* const v1, 0x7f07008e */
/* .line 5 */
(( e.h.b.a.f ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/b/a/f;->b(I)Le/h/b/a/f;
/* .line 6 */
(( e.b.a.s ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/s;->a(Landroid/widget/ImageView;)Le/b/a/c0/o/k;
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* .line 8 */
/* iput-boolean p1, p0, Le/h/b/a/m/d;->w:Z */
return;
} // .end method
public fr.mbs.binary.Octets d ( ) {
/* .locals 1 */
/* .line 6 */
v0 = this.k;
} // .end method
public void d ( android.widget.ImageView p0 ) {
/* .locals 3 */
/* const v0, 0x7f08014e */
/* .line 1 */
(( android.widget.ImageView ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.widget.ImageView ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;
v2 = this.h;
v1 = (( java.lang.Object ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
return;
/* .line 2 */
} // :cond_0
v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_2
java.net.URI .create ( v1 );
(( java.net.URI ) v1 ).getScheme ( ); // invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;
/* if-nez v1, :cond_1 */
/* .line 3 */
} // :cond_1
(( e.h.b.a.m.d ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/m/d;->c(Landroid/widget/ImageView;)V
/* .line 4 */
} // :cond_2
} // :goto_0
(( e.h.b.a.m.d ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/b/a/m/d;->b(Landroid/widget/ImageView;)V
/* .line 5 */
} // :goto_1
v1 = this.h;
(( android.widget.ImageView ) p1 ).setTag ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V
return;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 0 */
/* .line 7 */
/* iput-boolean p1, p0, Le/h/b/a/m/d;->B:Z */
return;
} // .end method
public e.h.b.a.p.i e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Le/h/b/a/m/d; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Le/h/b/a/m/d; */
/* .line 3 */
v1 = this.y;
v3 = e.h.b.a.m.a.d;
v1 = (( java.lang.Enum ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 4 */
v1 = this.v;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v1 ).getName ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
(( e.h.b.a.m.d ) p1 ).n ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v3 ).getName ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
v1 = m.a.a.c.e .a ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.v;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v1 ).getLogoUrl ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;
(( e.h.b.a.m.d ) p1 ).n ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p1 ).getLogoUrl ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;
p1 = m.a.a.c.e .a ( v1,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 5 */
} // :cond_3
/* iget-boolean v1, p0, Le/h/b/a/m/d;->f:Z */
/* iget-boolean v3, p1, Le/h/b/a/m/d;->f:Z */
/* if-ne v1, v3, :cond_4 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->j:Z */
/* iget-boolean v3, p1, Le/h/b/a/m/d;->j:Z */
/* if-ne v1, v3, :cond_4 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->l:Z */
/* iget-boolean v3, p1, Le/h/b/a/m/d;->l:Z */
/* if-ne v1, v3, :cond_4 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->p:Z */
/* iget-boolean v3, p1, Le/h/b/a/m/d;->p:Z */
/* if-ne v1, v3, :cond_4 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->m:Z */
/* iget-boolean v3, p1, Le/h/b/a/m/d;->m:Z */
/* if-ne v1, v3, :cond_4 */
v1 = this.d;
v3 = this.d;
/* .line 6 */
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.e;
v3 = this.e;
/* .line 7 */
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.g;
v3 = this.g;
/* .line 8 */
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.h;
v3 = this.h;
/* .line 9 */
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.c;
v3 = this.c;
/* .line 10 */
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.k;
v3 = this.k;
/* .line 11 */
v1 = java.util.Objects .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.n;
v3 = this.n;
/* if-ne v1, v3, :cond_4 */
v1 = this.o;
p1 = this.o;
/* if-ne v1, p1, :cond_4 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // .end method
public java.lang.String f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public java.lang.String g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public java.lang.String h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.r;
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
/* const/16 v0, 0xc */
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = this.e;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->f:Z */
java.lang.Boolean .valueOf ( v1 );
int v2 = 2; // const/4 v2, 0x2
/* aput-object v1, v0, v2 */
v1 = this.g;
int v2 = 3; // const/4 v2, 0x3
/* aput-object v1, v0, v2 */
v1 = this.h;
int v2 = 4; // const/4 v2, 0x4
/* aput-object v1, v0, v2 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->j:Z */
java.lang.Boolean .valueOf ( v1 );
int v2 = 5; // const/4 v2, 0x5
/* aput-object v1, v0, v2 */
v1 = this.k;
int v2 = 6; // const/4 v2, 0x6
/* aput-object v1, v0, v2 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->l:Z */
java.lang.Boolean .valueOf ( v1 );
int v2 = 7; // const/4 v2, 0x7
/* aput-object v1, v0, v2 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->m:Z */
java.lang.Boolean .valueOf ( v1 );
/* const/16 v2, 0x8 */
/* aput-object v1, v0, v2 */
v1 = this.n;
/* const/16 v2, 0x9 */
/* aput-object v1, v0, v2 */
v1 = this.o;
/* const/16 v2, 0xa */
/* aput-object v1, v0, v2 */
/* iget-boolean v1, p0, Le/h/b/a/m/d;->p:Z */
java.lang.Boolean .valueOf ( v1 );
/* const/16 v2, 0xb */
/* aput-object v1, v0, v2 */
v0 = java.util.Objects .hash ( v0 );
} // .end method
public java.lang.String i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public java.lang.String j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
} // .end method
public com.orange.oab.contactless.packid.rssi.RssiLevel k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
} // .end method
public final Integer l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( e.h.b.a.m.d ) p0 ).A ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->A()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const v0, 0x7f05001f */
} // :cond_0
/* const v0, 0x7f050089 */
} // :goto_0
} // .end method
public final Integer m ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* const v0, 0x7f0e0147 */
} // :cond_0
/* const v0, 0x7f0e0149 */
} // :goto_0
/* .line 3 */
} // :cond_1
v0 = e.h.b.a.m.b.a;
v1 = this.n;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_4 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_3 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_2 */
/* const v0, 0x7f0e0165 */
} // :cond_2
/* const v0, 0x7f0e003c */
} // :cond_3
/* const v0, 0x7f0e003f */
} // :cond_4
/* const v0, 0x7f0e0040 */
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Tenant n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
} // .end method
public java.lang.String o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.b.a.p.i ) v0 ).c ( ); // invoke-virtual {v0}, Le/h/b/a/p/i;->c()Ljava/lang/String;
/* .line 3 */
} // :cond_0
(( e.h.b.a.m.d ) p0 ).n ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).getName ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
} // .end method
public e.h.b.a.m.i p ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.s;
} // .end method
public e.h.b.a.m.a q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
} // .end method
public Boolean r ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->x:Z */
} // .end method
public Boolean s ( ) {
/* .locals 2 */
final String v0 = "caf\u00e9"; // const-string v0, "caf\u00e9"
/* .line 1 */
v0 = (( e.h.b.a.m.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/m/d;->a(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
final String v0 = "coffee"; // const-string v0, "coffee"
v0 = (( e.h.b.a.m.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/b/a/m/d;->a(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
(( e.h.b.a.m.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
v1 = e.h.b.a.m.d.C;
v0 = (( fr.mbs.binary.Octets ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean t ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->m:Z */
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public Boolean u ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->u:Z */
} // .end method
public Boolean v ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->w:Z */
} // .end method
public Boolean w ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->A:Z */
} // .end method
public Boolean x ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->B:Z */
} // .end method
public Boolean y ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->p:Z */
} // .end method
public Boolean z ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Le/h/b/a/m/d;->q:Z */
} // .end method
