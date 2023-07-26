public class com.orange.hce.proto.activity.CoffeeBadgeDetailActivity extends e.h.b.a.l.d1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.activity.CoffeeBadgeDetailActivity ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/b/a/l/d1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( android.view.LayoutInflater p0, Integer p1, Integer p2, com.orange.oab.contactless.packid.domain.Transaction p3 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( android.view.LayoutInflater ) p1 ).inflate ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
		 /* .line 2 */
		 (( android.view.View ) p1 ).findViewById ( p3 ); // invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 /* check-cast p2, Landroid/widget/TextView; */
		 /* .line 3 */
		 (( com.orange.oab.contactless.packid.domain.Transaction ) p4 ).getAmountInCents ( ); // invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getAmountInCents()Ljava/lang/Integer;
		 p3 = 		 (( java.lang.Integer ) p3 ).intValue ( ); // invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
		 (( com.orange.hce.proto.activity.CoffeeBadgeDetailActivity ) p0 ).e ( p3 ); // invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity;->e(I)Ljava/lang/String;
		 (( android.widget.TextView ) p2 ).setText ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 4 */
		 (( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
		 (( com.orange.oab.contactless.packid.domain.Transaction ) p4 ).getAmountInCents ( ); // invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getAmountInCents()Ljava/lang/Integer;
		 v0 = 		 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
		 /* if-ltz v0, :cond_0 */
		 /* const v0, 0x7f05001f */
	 } // :cond_0
	 /* const v0, 0x7f050095 */
} // :goto_0
p3 = c.h.f.f .a ( p3,v0 );
(( android.widget.TextView ) p2 ).setTextColor ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V
/* const p2, 0x7f080186 */
/* .line 5 */
(( android.view.View ) p1 ).findViewById ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast p2, Landroid/widget/TextView; */
/* .line 6 */
(( com.orange.oab.contactless.packid.domain.Transaction ) p4 ).getDescription ( ); // invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/domain/Transaction;->getDescription()Ljava/lang/String;
(( android.widget.TextView ) p2 ).setText ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // .end method
public void b ( Object p0 ) {
/* .locals 5 */
final String v0 = "nfco.CoffeeBadgeAct"; // const-string v0, "nfco.CoffeeBadgeAct"
/* .line 1 */
try { // :try_start_0
	 /* new-instance v1, Lcom/orange/business/packid/android/lib/PackId; */
	 /* invoke-direct {v1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
	 (( e.h.b.a.m.d ) p1 ).d ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;
	 (( com.orange.business.packid.android.lib.PackId ) v1 ).getUserByContactlessId ( v2 ); // invoke-virtual {v1, v2}, Lcom/orange/business/packid/android/lib/PackId;->getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getWallet ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
	 (( e.h.b.a.m.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).findTokenByZone ( p1 ); // invoke-virtual {v1, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getTokenData ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
	 /* .line 2 */
	 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).getApplicationData ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;
	 com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData .parse ( p1 );
	 /* const v1, 0x7f080145 */
	 /* .line 3 */
	 (( c.b.k.r ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.view.View ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
	 /* const v1, 0x7f0800db */
	 /* .line 4 */
	 (( c.b.k.r ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast v1, Landroid/widget/LinearLayout; */
	 /* const v3, 0x7f080177 */
	 /* .line 5 */
	 (( c.b.k.r ) p0 ).findViewById ( v3 ); // invoke-virtual {p0, v3}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
	 /* check-cast v3, Landroid/widget/TextView; */
	 /* .line 6 */
	 v4 = 	 (( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) p1 ).getCurrentBalance ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getCurrentBalance()I
	 (( com.orange.hce.proto.activity.CoffeeBadgeDetailActivity ) p0 ).e ( v4 ); // invoke-virtual {p0, v4}, Lcom/orange/hce/proto/activity/CoffeeBadgeDetailActivity;->e(I)Ljava/lang/String;
	 (( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 7 */
	 (( com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData ) p1 ).getLastTransactionType ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getLastTransactionType()Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
	 v3 = com.orange.oab.contactless.packid.domain.aztek.AztecApplicationData$TransactionType.UNKNOWN;
	 /* if-ne p1, v3, :cond_0 */
	 /* .line 8 */
	 (( android.widget.LinearLayout ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
} // :cond_0
/* const/16 p1, 0x8 */
/* .line 9 */
(( android.widget.LinearLayout ) v1 ).setVisibility ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p1 = "Unknown application data"; // const-string p1, "Unknown application data"
/* .line 10 */
android.util.Log .i ( v0,p1 );
/* :catch_1 */
final String p1 = "No user available while trying to update badges view"; // const-string p1, "No user available while trying to update badges view"
/* .line 11 */
android.util.Log .i ( v0,p1 );
/* :catch_2 */
/* move-exception p1 */
final String v1 = "Error on finding token (nothing to scare)"; // const-string v1, "Error on finding token (nothing to scare)"
/* .line 12 */
android.util.Log .d ( v0,v1,p1 );
} // :goto_0
return;
} // .end method
public java.lang.String e ( Integer p0 ) {
/* .locals 5 */
/* .line 1 */
java.text.NumberFormat .getCurrencyInstance ( );
/* .line 2 */
(( c.b.k.r ) p0 ).getResources ( ); // invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;
/* const v2, 0x7f0e0082 */
(( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
java.util.Currency .getInstance ( v1 );
(( java.text.NumberFormat ) v0 ).setCurrency ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setCurrency(Ljava/util/Currency;)V
/* int-to-double v1, p1 */
/* const-wide/high16 v3, 0x4059000000000000L # 100.0 */
/* div-double/2addr v1, v3 */
/* .line 3 */
(( java.text.NumberFormat ) v0 ).format ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;
} // .end method
public Integer s ( ) {
/* .locals 1 */
/* const v0, 0x7f0b001e */
} // .end method
public Integer t ( ) {
/* .locals 1 */
/* const v0, 0x7f0b006c */
} // .end method
