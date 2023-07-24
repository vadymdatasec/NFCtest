.class public Lcom/orange/hce/proto/activity/QrCodeActivity;
.super Lc/b/k/r;
.source "SourceFile"

# interfaces
.implements Lj/a/a/b/b$a;


# instance fields
.field public q:Lj/a/a/b/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/e/j;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QR Code found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.qrcode"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/QrCodeActivity;->a(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/QrCodeActivity;->b(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const p1, 0x7f0e00c1

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 5
    iget-object p1, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    invoke-virtual {p1, p0}, Lj/a/a/b/b;->a(Lj/a/a/b/b$a;)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 8
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void
.end method

.method public final a(Landroid/net/Uri;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "packids"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Lj/a/a/b/b;

    invoke-direct {p1, p0}, Lj/a/a/b/b;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    .line 3
    sget-object v0, Le/f/e/a;->m:Le/f/e/a;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj/a/a/b/b;->setFormats(Ljava/util/List;)V

    .line 4
    iget-object p1, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0}, Lj/a/a/a/a;->setAspectTolerance(F)V

    .line 5
    iget-object p1, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(Landroid/view/View;)V

    const-string p1, "android.permission.CAMERA"

    .line 6
    invoke-static {p0, p1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x64

    invoke-static {p0, p1, v0}, Lc/h/e/f;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onPause()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    invoke-virtual {v0}, Lj/a/a/a/a;->d()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    const/16 v0, 0x64

    if-ne p1, v0, :cond_0

    .line 1
    array-length p1, p2

    if-lez p1, :cond_0

    const/4 p1, 0x0

    aget-object p2, p2, p1

    const-string v0, "android.permission.CAMERA"

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    array-length p2, p3

    if-lez p2, :cond_0

    aget p1, p3, p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 3
    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/orange/hce/proto/activity/SplashScreenActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    invoke-virtual {v0, p0}, Lj/a/a/b/b;->setResultHandler(Lj/a/a/b/b$a;)V

    .line 3
    iget-object v0, p0, Lcom/orange/hce/proto/activity/QrCodeActivity;->q:Lj/a/a/b/b;

    invoke-virtual {v0}, Lj/a/a/a/a;->c()V

    return-void
.end method
