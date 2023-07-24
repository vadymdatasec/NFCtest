.class public Lcom/orange/hce/proto/activity/PermissionsActivity;
.super Lc/b/k/r;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# static fields
.field public static final x:I


# instance fields
.field public q:Landroidx/viewpager/widget/ViewPager;

.field public r:Lc/y/a/a;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Z

.field public v:[Le/h/b/a/o/a;

.field public final w:Landroid/content/BroadcastReceiver;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    .line 2
    new-instance v0, Lcom/orange/hce/proto/activity/PermissionsActivity$a;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/PermissionsActivity$a;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->w:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/PermissionsActivity;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/PermissionsActivity;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z

    return p1
.end method

.method public static synthetic b(Lcom/orange/hce/proto/activity/PermissionsActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z

    return p0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    const-string v0, "android.permission.BLUETOOTH_SCAN"

    .line 1
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    .line 2
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final B()Le/h/b/a/p/m;
    .locals 5

    .line 1
    new-instance v0, Le/h/b/a/p/m;

    invoke-direct {v0}, Le/h/b/a/p/m;-><init>()V

    .line 2
    sget v1, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v2, 0x1d

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-lt v1, v2, :cond_3

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 3
    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Le/h/b/a/p/m;->b(Z)V

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 4
    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    const/4 v3, 0x1

    :cond_2
    invoke-virtual {v0, v3}, Le/h/b/a/p/m;->a(Z)V

    return-object v0

    :cond_3
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    .line 5
    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4

    const/4 v3, 0x1

    :cond_4
    invoke-virtual {v0, v3}, Le/h/b/a/p/m;->b(Z)V

    .line 6
    invoke-virtual {v0, v4}, Le/h/b/a/p/m;->a(Z)V

    return-object v0
.end method

.method public C()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BatteryLife"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const-string v0, "PermissionsActivity"

    const-string v1, "BLE-OPTIMIZATIONS: ask user to ignore battery optimization for Pack ID"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method

.method public final D()V
    .locals 2

    const-string v0, "PermissionsActivity"

    const-string v1, "Start next activity"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public a(IFI)V
    .locals 0

    return-void
.end method

.method public synthetic a(Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->onBackPressed()V

    return-void
.end method

.method public final a(Landroid/widget/ImageView;II)V
    .locals 1

    .line 4
    invoke-static {p0, p2}, Lc/h/f/f;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 6
    invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/PermissionsActivity;->f(I)I

    move-result v0

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 7
    invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/PermissionsActivity;->f(I)I

    move-result p3

    iput p3, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public synthetic b(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V

    return-void
.end method

.method public synthetic c(Landroid/view/View;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->u()V

    return-void
.end method

.method public synthetic d(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void
.end method

.method public final e(I)V
    .locals 1

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    goto :goto_0

    :cond_0
    const/16 p1, 0x2b67

    .line 2
    invoke-static {p0, p1}, Le/h/b/a/h;->a(Lcom/orange/hce/proto/activity/PermissionsActivity;I)V

    :goto_0
    return-void
.end method

.method public synthetic e(Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->y()V

    return-void
.end method

.method public final f(I)I
    .locals 2

    int-to-float p1, p1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method public synthetic f(Landroid/view/View;)V
    .locals 0

    const/16 p1, 0x79

    .line 2
    invoke-static {p0, p1}, Le/h/b/a/p/k;->a(Landroid/app/Activity;I)V

    return-void
.end method

.method public final g(I)V
    .locals 11

    const v0, 0x7f0800b4

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0xa

    const v2, 0x7f05005d

    .line 2
    invoke-virtual {p0, v0, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    const v3, 0x7f0800b5

    .line 3
    invoke-virtual {p0, v3}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 4
    invoke-virtual {p0, v3, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    const v4, 0x7f0800b6

    .line 5
    invoke-virtual {p0, v4}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 6
    invoke-virtual {p0, v4, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    const v5, 0x7f0800b7

    .line 7
    invoke-virtual {p0, v5}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 8
    invoke-virtual {p0, v5, v2, v1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    const v1, 0x7f0e0113

    const/16 v2, 0x1f

    const v6, 0x7f0e0055

    const/16 v7, 0xd

    const v8, 0x7f050026

    if-nez p1, :cond_1

    .line 9
    invoke-virtual {p0, v0, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    .line 10
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->t:Landroid/widget/TextView;

    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    if-lt v0, v2, :cond_0

    const v1, 0x7f0e0055

    :cond_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const v9, 0x7f0e010d

    const/4 v10, 0x0

    if-ne p1, v0, :cond_2

    .line 12
    invoke-virtual {p0, v3, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    .line 13
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(I)V

    .line 15
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    .line 16
    invoke-virtual {p0, v4, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    .line 17
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    if-lt v0, v2, :cond_3

    const v1, 0x7f0e0055

    :cond_3
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 19
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f0e0103

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 20
    :cond_4
    invoke-virtual {p0, v5, v8, v7}, Lcom/orange/hce/proto/activity/PermissionsActivity;->a(Landroid/widget/ImageView;II)V

    .line 21
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 22
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f0e0081

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method public synthetic g(Landroid/view/View;)V
    .locals 0

    .line 23
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->D()V

    return-void
.end method

.method public h(I)V
    .locals 12

    .line 1
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->g(I)V

    const v0, 0x7f080100

    .line 2
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0800ca

    .line 3
    invoke-virtual {p0, v1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v2, 0x7f08010c

    .line 4
    invoke-virtual {p0, v2}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 5
    sget-object v3, Lcom/orange/hce/proto/activity/PermissionsActivity$b;->a:[I

    iget-object v4, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->v:[Le/h/b/a/o/a;

    aget-object p1, v4, p1

    invoke-virtual {p1}, Le/h/b/a/o/a;->z0()Le/h/b/a/o/a$a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v3, p1

    const/4 v3, 0x1

    const v4, 0x7f0e00fd

    const v5, 0x7f050058

    const v6, 0x7f0700a0

    const v7, 0x7f050095

    const v8, 0x7f07009f

    const v9, 0x7f0e0116

    const/4 v10, 0x4

    const/4 v11, 0x0

    if-eq p1, v3, :cond_b

    const/4 v3, 0x2

    if-eq p1, v3, :cond_9

    const/4 v3, 0x3

    if-eq p1, v3, :cond_5

    if-eq p1, v10, :cond_2

    const/4 v3, 0x5

    if-eq p1, v3, :cond_0

    goto/16 :goto_0

    .line 6
    :cond_0
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V

    .line 7
    invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V

    .line 8
    new-instance p1, Le/h/b/a/l/k0;

    invoke-direct {p1, p0}, Le/h/b/a/l/k0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    new-instance p1, Le/h/b/a/l/i0;

    invoke-direct {p1, p0}, Le/h/b/a/l/i0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-static {p0}, Le/h/b/a/p/k;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f0e0110

    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 12
    invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V

    .line 13
    invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 14
    invoke-static {p0, v5}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    :cond_1
    const p1, 0x7f0e010f

    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 16
    invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V

    .line 17
    invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 18
    invoke-static {p0, v7}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 19
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt p1, v3, :cond_4

    const p1, 0x7f0e0081

    .line 20
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(I)V

    .line 21
    new-instance p1, Le/h/b/a/l/f0;

    invoke-direct {p1, p0}, Le/h/b/a/l/f0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V

    .line 23
    new-instance p1, Le/h/b/a/l/g0;

    invoke-direct {p1, p0}, Le/h/b/a/l/g0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string p1, "power"

    .line 24
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f0e0102

    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 26
    invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 27
    invoke-static {p0, v5}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 28
    invoke-virtual {v2, v9}, Landroid/widget/Button;->setText(I)V

    .line 29
    new-instance p1, Le/h/b/a/l/d0;

    invoke-direct {p1, p0}, Le/h/b/a/l/d0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    :cond_3
    const p1, 0x7f0e0104

    .line 30
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 31
    invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V

    .line 32
    invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 33
    invoke-static {p0, v7}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 34
    :cond_4
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    goto/16 :goto_0

    .line 35
    :cond_5
    invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V

    .line 36
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V

    .line 37
    new-instance p1, Le/h/b/a/l/o0;

    invoke-direct {p1, p0}, Le/h/b/a/l/o0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    new-instance p1, Le/h/b/a/l/c0;

    invoke-direct {p1, p0}, Le/h/b/a/l/c0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->B()Le/h/b/a/p/m;

    move-result-object p1

    if-nez p1, :cond_6

    return-void

    .line 40
    :cond_6
    invoke-virtual {p1}, Le/h/b/a/p/m;->b()Z

    move-result v1

    if-nez v1, :cond_7

    const p1, 0x7f0e0114

    .line 41
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 42
    invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V

    .line 43
    invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 44
    invoke-static {p0, v7}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 45
    :cond_7
    invoke-virtual {p1}, Le/h/b/a/p/m;->a()Z

    move-result p1

    if-eqz p1, :cond_8

    const p1, 0x7f0e0112

    .line 46
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 47
    invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V

    .line 48
    invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 49
    invoke-static {p0, v5}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    :cond_8
    const p1, 0x7f0e0115

    .line 50
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 51
    invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V

    const p1, 0x7f0700bc

    .line 52
    invoke-virtual {v0, p1, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    const p1, 0x7f0500ad

    .line 53
    invoke-static {p0, p1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 54
    :cond_9
    invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V

    .line 55
    new-instance p1, Le/h/b/a/l/p0;

    invoke-direct {p1, p0}, Le/h/b/a/l/p0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    new-instance p1, Le/h/b/a/l/n0;

    invoke-direct {p1, p0}, Le/h/b/a/l/n0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0e00fe

    .line 57
    invoke-virtual {v2, p1}, Landroid/widget/Button;->setText(I)V

    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_a

    const p1, 0x7f0e0109

    .line 59
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 60
    invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V

    .line 61
    invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 62
    invoke-static {p0, v5}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_a
    const p1, 0x7f0e0108

    .line 63
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 64
    invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V

    .line 65
    invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 66
    invoke-static {p0, v7}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_b
    const p1, 0x7f0e010c

    .line 67
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(I)V

    .line 68
    new-instance p1, Le/h/b/a/l/h0;

    invoke-direct {p1, p0}, Le/h/b/a/l/h0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    new-instance p1, Le/h/b/a/l/e0;

    invoke-direct {p1, p0}, Le/h/b/a/l/e0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V

    .line 71
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->A()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 72
    invoke-virtual {v1, v9}, Landroid/widget/Button;->setText(I)V

    .line 73
    new-instance p1, Le/h/b/a/l/j0;

    invoke-direct {p1, p0}, Le/h/b/a/l/j0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0e0105

    .line 74
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 75
    invoke-virtual {v2, v10}, Landroid/widget/Button;->setVisibility(I)V

    .line 76
    invoke-virtual {v0, v6, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 77
    invoke-static {p0, v5}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_c
    const p1, 0x7f0e0106

    .line 78
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 79
    invoke-virtual {v2, v11}, Landroid/widget/Button;->setVisibility(I)V

    .line 80
    invoke-virtual {v0, v8, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 81
    invoke-static {p0, v7}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method

.method public synthetic h(Landroid/view/View;)V
    .locals 0

    .line 82
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->s()V

    return-void
.end method

.method public synthetic i(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void
.end method

.method public synthetic j(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void
.end method

.method public synthetic k(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->v()V

    return-void
.end method

.method public synthetic l(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->x()V

    return-void
.end method

.method public synthetic m(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->t()V

    return-void
.end method

.method public synthetic n(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->w()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lc/l/d/f0;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    .line 2
    invoke-virtual {p0, p3}, Lcom/orange/hce/proto/activity/PermissionsActivity;->e(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x79

    if-ne p1, v0, :cond_1

    const/4 p1, 0x2

    .line 3
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V

    .line 4
    invoke-static {p0}, Le/h/b/a/p/k;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 5
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x29a

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    if-ne p2, p1, :cond_2

    .line 6
    iput-boolean p3, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->u:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0023

    .line 2
    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onCreate on OS_VERSION "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PermissionsActivity"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    sget p1, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/16 v5, 0x1f

    if-lt p1, v5, :cond_0

    new-array p1, v4, [Le/h/b/a/o/a;

    .line 5
    invoke-static {}, Le/h/b/a/o/a;->A0()Le/h/b/a/o/a;

    move-result-object v4

    aput-object v4, p1, v3

    invoke-static {}, Le/h/b/a/o/a;->C0()Le/h/b/a/o/a;

    move-result-object v3

    aput-object v3, p1, v2

    invoke-static {}, Le/h/b/a/o/a;->D0()Le/h/b/a/o/a;

    move-result-object v2

    aput-object v2, p1, v1

    invoke-static {}, Le/h/b/a/o/a;->B0()Le/h/b/a/o/a;

    move-result-object v1

    aput-object v1, p1, v0

    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->v:[Le/h/b/a/o/a;

    goto :goto_0

    :cond_0
    new-array p1, v4, [Le/h/b/a/o/a;

    .line 6
    invoke-static {}, Le/h/b/a/o/a;->C0()Le/h/b/a/o/a;

    move-result-object v4

    aput-object v4, p1, v3

    invoke-static {}, Le/h/b/a/o/a;->E0()Le/h/b/a/o/a;

    move-result-object v3

    aput-object v3, p1, v2

    invoke-static {}, Le/h/b/a/o/a;->D0()Le/h/b/a/o/a;

    move-result-object v2

    aput-object v2, p1, v1

    invoke-static {}, Le/h/b/a/o/a;->B0()Le/h/b/a/o/a;

    move-result-object v1

    aput-object v1, p1, v0

    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->v:[Le/h/b/a/o/a;

    .line 7
    :goto_0
    new-instance p1, Le/h/b/a/l/b1;

    invoke-virtual {p0}, Lc/l/d/f0;->j()Lc/l/d/o1;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->v:[Le/h/b/a/o/a;

    invoke-direct {p1, v0, v1}, Le/h/b/a/l/b1;-><init>(Lc/l/d/o1;[Landroidx/fragment/app/Fragment;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->r:Lc/y/a/a;

    const p1, 0x7f080197

    .line 8
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/viewpager/widget/ViewPager;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    .line 9
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->r:Lc/y/a/a;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lc/y/a/a;)V

    .line 10
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->a(Landroidx/viewpager/widget/ViewPager$j;)V

    const p1, 0x7f080103

    .line 11
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->s:Landroid/widget/TextView;

    .line 12
    new-instance v0, Le/h/b/a/l/m0;

    invoke-direct {v0, p0}, Le/h/b/a/l/m0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0800ec

    .line 13
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->t:Landroid/widget/TextView;

    .line 14
    new-instance v0, Le/h/b/a/l/l0;

    invoke-direct {v0, p0}, Le/h/b/a/l/l0;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->c(I)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->e(I)V

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->w:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/b/k/r;->onStop()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->w:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final s()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void

    :cond_0
    const/16 v0, 0x21

    .line 3
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Lc/b/k/r;I)V

    return-void
.end method

.method public final t()V
    .locals 4

    .line 1
    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    const/16 v2, 0x1c

    const/16 v3, 0x1f

    if-ge v0, v3, :cond_3

    if-lt v0, v2, :cond_3

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 2
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void

    .line 4
    :cond_0
    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    if-ne v0, v2, :cond_1

    const/16 v0, 0x457

    .line 5
    invoke-static {p0, v0}, Le/h/b/a/h;->b(Lc/b/k/r;I)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1d

    if-ne v0, v1, :cond_2

    const/16 v0, 0x6f

    .line 6
    invoke-static {p0, v0}, Le/h/b/a/h;->c(Lc/b/k/r;I)V

    goto :goto_0

    :cond_2
    const/16 v0, 0xb

    .line 7
    invoke-static {p0, v0}, Le/h/b/a/h;->b(Lcom/orange/hce/proto/activity/PermissionsActivity;I)V

    goto :goto_0

    .line 8
    :cond_3
    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    if-ge v0, v2, :cond_5

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 9
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_4

    invoke-static {p0, v1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_4

    .line 10
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void

    .line 11
    :cond_4
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lc/h/e/f;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->C()V

    goto :goto_0

    :cond_0
    const-string v0, "PermissionsActivity"

    const-string v1, "SDK is too low for permission: battery optimization"

    .line 3
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    :goto_0
    return-void
.end method

.method public final v()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    sget v0, Lcom/orange/hce/proto/activity/PermissionsActivity;->x:I

    const/16 v1, 0x1f

    const/16 v2, 0x29a

    const-string v3, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    if-lt v0, v1, :cond_0

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    .line 3
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final w()V
    .locals 2

    const-string v0, "PermissionsActivity"

    const-string v1, "User deny to disable doze mode"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->D()V

    return-void
.end method

.method public final x()V
    .locals 2

    const-string v0, "PermissionsActivity"

    const-string v1, "User deny location"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->r:Lc/y/a/a;

    invoke-virtual {v1}, Lc/y/a/a;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->r:Lc/y/a/a;

    invoke-virtual {v1}, Lc/y/a/a;->a()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->D()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/PermissionsActivity;->q:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :goto_0
    return-void
.end method
