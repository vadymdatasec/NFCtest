.class public Lcom/orange/hce/proto/activity/LogActivity;
.super Lc/b/k/r;
.source "SourceFile"


# static fields
.field public static final B:I

.field public static final C:I


# instance fields
.field public A:Landroid/widget/Switch;

.field public final q:Landroid/os/Handler;

.field public r:Landroid/content/BroadcastReceiver;

.field public s:Landroid/view/ViewGroup;

.field public t:Landroid/view/View;

.field public u:Landroid/view/Menu;

.field public v:Ljava/lang/Boolean;

.field public w:Le/h/b/a/l/a1;

.field public final x:Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

.field public final y:Landroid/content/BroadcastReceiver;

.field public z:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x7f

    const/4 v1, 0x0

    const/16 v2, 0xff

    .line 1
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/orange/hce/proto/activity/LogActivity;->B:I

    const/16 v0, 0x33

    const/16 v1, 0xb3

    const/16 v2, 0xa6

    .line 2
    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/orange/hce/proto/activity/LogActivity;->C:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->q:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->v:Ljava/lang/Boolean;

    .line 4
    new-instance v0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    const/16 v1, 0x64

    const/16 v2, 0x3c

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;-><init>(II)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->x:Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    .line 5
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->s()Landroid/content/BroadcastReceiver;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->y:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic a(FLandroid/content/Context;)F
    .locals 0

    .line 4
    invoke-static {p0, p1}, Lcom/orange/hce/proto/activity/LogActivity;->b(FLandroid/content/Context;)F

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/LogActivity;)Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/LogActivity;->x:Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;

    return-object p0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/LogActivity;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/l/e1;
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/l/e1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/LogActivity;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->v:Ljava/lang/Boolean;

    return-object p1
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/LogActivity;Landroid/widget/TextView;Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/TextView;Ljava/lang/String;I)V

    return-void
.end method

.method public static b(FLandroid/content/Context;)F
    .locals 1

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 4
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x43200000    # 160.0f

    div-float/2addr p1, v0

    mul-float p0, p0, p1

    return p0
.end method

.method public static synthetic b(Lcom/orange/hce/proto/activity/LogActivity;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/LogActivity;->v:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic c(Lcom/orange/hce/proto/activity/LogActivity;)Le/h/b/a/l/a1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    return-object p0
.end method

.method public static synthetic d(Lcom/orange/hce/proto/activity/LogActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->x()V

    return-void
.end method

.method public static synthetic e(Lcom/orange/hce/proto/activity/LogActivity;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/LogActivity;->s:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public static synthetic f(Lcom/orange/hce/proto/activity/LogActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/LogActivity;->q:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    const-string v1, "=== Informations ==="

    invoke-virtual {v0, v1}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->B()V

    const v0, 0x7f08004d

    const v1, 0x7f0e0036

    .line 4
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->t()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    const v0, 0x7f08004e

    const v1, 0x7f0e0037

    const-string v2, "2.51.3 (289)"

    .line 5
    invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    const v0, 0x7f0800f8

    const v1, 0x7f0e00ea

    .line 6
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    const v0, 0x7f08018f

    const v1, 0x7f0e0174

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    const v0, 0x7f080078

    const v1, 0x7f0e0080

    .line 8
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->w()V

    .line 10
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    const-string v1, "=== Logs ==="

    invoke-virtual {v0, v1}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final B()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "packid.app.preferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "deviceModel"

    .line 2
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 3
    invoke-static {p0}, Le/g/a/a/b;->a(Landroid/content/Context;)Le/g/a/a/b$c;

    move-result-object v2

    new-instance v3, Le/h/b/a/l/y;

    invoke-direct {v3, p0, v0}, Le/h/b/a/l/y;-><init>(Lcom/orange/hce/proto/activity/LogActivity;Landroid/content/SharedPreferences;)V

    invoke-virtual {v2, v3}, Le/g/a/a/b$c;->a(Le/g/a/a/b$a;)V

    :cond_0
    const v2, 0x7f0800e4

    const v3, 0x7f0e0090

    const v4, 0x7f0e0135

    .line 4
    invoke-virtual {p0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v3, v0}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    return-void
.end method

.method public final C()V
    .locals 3

    const v0, 0x7f0800dd

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 2
    invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V

    .line 3
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/k/a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lc/b/k/a;->d(Z)V

    const v1, 0x7f050026

    .line 4
    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/widget/ScrollView;)Landroid/content/BroadcastReceiver;
    .locals 2

    const v0, 0x7f080181

    .line 8
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 9
    new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$d;

    invoke-direct {v1, p0, v0, p1}, Lcom/orange/hce/proto/activity/LogActivity$d;-><init>(Lcom/orange/hce/proto/activity/LogActivity;Landroid/widget/TextView;Landroid/widget/ScrollView;)V

    return-object v1
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/l/e1;
    .locals 3

    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->s:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 11
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->s:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Le/h/b/a/l/e1;

    .line 12
    invoke-virtual {v1, p1, p2}, Le/h/b/a/l/e1;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(IILjava/lang/String;)V
    .locals 2

    .line 16
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f080075

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f080076

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {p1}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 20
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public synthetic a(Landroid/content/SharedPreferences;Le/g/a/a/b$b;Ljava/lang/Exception;)V
    .locals 1

    .line 13
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p2, Le/g/a/a/b$b;->a:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p2, Le/g/a/a/b$b;->b:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Le/g/a/a/b$b;->d:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p3, "deviceModel"

    invoke-interface {p1, p3, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    const p1, 0x7f0800e4

    const p3, 0x7f0e0090

    .line 15
    invoke-virtual {p0, p1, p3, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(IILjava/lang/String;)V

    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 1

    const v0, 0x7f08012a

    .line 7
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->g()Z

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public synthetic a(Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/orange/hce/proto/PackIdApp;

    invoke-virtual {p1}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/orange/business/packid/android/lib/PackId;->activatePersistentLogs(Z)V

    return-void
.end method

.method public final a(Landroid/widget/TextView;Ljava/lang/String;I)V
    .locals 2

    .line 21
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 23
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    .line 24
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Landroid/text/Spannable;

    .line 25
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v1, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 p3, 0x0

    invoke-interface {p1, v1, v0, p2, p3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public e(I)V
    .locals 2

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.ACTION_SCAN_MODE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "readerAddress"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/p/a/d;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Le/h/b/a/l/a1;

    invoke-direct {p1, p0}, Le/h/b/a/l/a1;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    .line 3
    invoke-virtual {p1, p0}, Le/h/b/a/l/a1;->a(Landroid/app/Activity;)V

    const p1, 0x7f0b0021

    .line 4
    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V

    const p1, 0x7f0800da

    .line 5
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->s:Landroid/view/ViewGroup;

    const p1, 0x7f080071

    .line 6
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->t:Landroid/view/View;

    const p1, 0x7f080101

    .line 7
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Switch;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->A:Landroid/widget/Switch;

    const p1, 0x7f080181

    .line 8
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->z:Landroid/widget/TextView;

    .line 9
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->z()V

    .line 10
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->C()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->u:Landroid/view/Menu;

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0c0003

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f08012a

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 2
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->e(I)V

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x2

    .line 4
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->e(I)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->e(I)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->k()V

    .line 7
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x7f080007
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->q:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 3
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 4
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 5
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->stopBroadcastRSSI()V

    .line 6
    invoke-static {}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->resetLogScreenPrinter()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {p2, p1, p3}, Le/h/b/a/l/a1;->a(I[I)V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity;->u:Landroid/view/Menu;

    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/view/Menu;)V

    const/4 p1, 0x0

    .line 3
    aget p1, p3, p1

    if-nez p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->A()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->initLogScreenPrinter(Landroid/content/Context;)V

    .line 3
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->startBroadcastRSSI()V

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->h()Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->z:Landroid/widget/TextView;

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    const v0, 0x7f08011a

    .line 6
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/ScrollView;)Landroid/content/BroadcastReceiver;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->r:Landroid/content/BroadcastReceiver;

    .line 7
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->r:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "LogService"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 8
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->y:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.RSSI"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 9
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->A()V

    .line 10
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->y()V

    const v0, 0x7f080110

    .line 11
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Switch;

    .line 12
    new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$a;

    invoke-direct {v1, p0}, Lcom/orange/hce/proto/activity/LogActivity$a;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 13
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->A:Landroid/widget/Switch;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/orange/hce/proto/PackIdApp;

    invoke-virtual {v1}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/business/packid/android/lib/PackId;->isPersistentLogsActive()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 14
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->A:Landroid/widget/Switch;

    new-instance v1, Le/h/b/a/l/z;

    invoke-direct {v1, p0}, Le/h/b/a/l/z;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final s()Landroid/content/BroadcastReceiver;
    .locals 1

    .line 1
    new-instance v0, Lcom/orange/hce/proto/activity/LogActivity$e;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/LogActivity$e;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V

    return-object v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getContactlessIds()Ljava/util/List;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[ "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    const-string v3, ", "

    goto :goto_1

    :cond_0
    const-string v3, ""

    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v0, " ]"

    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isUWBAvaible(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "compatible"

    return-object v0

    :cond_0
    const-string v0, "not compatible"

    return-object v0
.end method

.method public final w()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->s:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 3
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSimCentric()Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 5
    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z

    move-result v4

    if-nez v4, :cond_1

    .line 6
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity;->s:Landroid/view/ViewGroup;

    new-instance v12, Le/h/b/a/l/e1;

    .line 7
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v7

    .line 8
    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v8

    .line 9
    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v9

    .line 10
    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B

    move-result v10

    .line 11
    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssiButtonInterval()B

    move-result v11

    move-object v5, v12

    move-object v6, p0

    invoke-direct/range {v5 .. v11}, Le/h/b/a/l/e1;-><init>(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;BB)V

    .line 12
    invoke-virtual {v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v4}, Le/h/b/a/l/a1;->f()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 14
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "* contactlessId: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " zone:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ") rssi:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B

    move-result v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->i()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->e()V

    .line 3
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->z:Landroid/widget/TextView;

    sget-object v1, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    const-string v2, ""

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 4
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LogActivity;->A()V

    .line 5
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->w:Le/h/b/a/l/a1;

    invoke-virtual {v0}, Le/h/b/a/l/a1;->h()Ljava/lang/String;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity;->z:Landroid/widget/TextView;

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->q:Landroid/os/Handler;

    new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$c;

    const/16 v2, 0x3e8

    invoke-direct {v1, p0, v2}, Lcom/orange/hce/proto/activity/LogActivity$c;-><init>(Lcom/orange/hce/proto/activity/LogActivity;I)V

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity;->t:Landroid/view/View;

    new-instance v1, Lcom/orange/hce/proto/activity/LogActivity$b;

    invoke-direct {v1, p0}, Lcom/orange/hce/proto/activity/LogActivity$b;-><init>(Lcom/orange/hce/proto/activity/LogActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
