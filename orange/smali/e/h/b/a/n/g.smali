.class public Le/h/b/a/n/g;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/b/a/n/g;->a:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const-string v0, "packid.ScreenUnlockErr"

    const-string v1, "Quit application because there is no lock screen on current device"

    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iget-object v0, p0, Le/h/b/a/n/g;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finishAffinity()V

    .line 11
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.HOME"

    .line 12
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 14
    iget-object v1, p0, Le/h/b/a/n/g;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final a(Landroid/content/Context;I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    new-instance p1, Le/h/b/a/n/b;

    invoke-direct {p1, p0}, Le/h/b/a/n/b;-><init>(Le/h/b/a/n/g;)V

    .line 2
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, Le/h/b/a/n/a;

    invoke-direct {p2, p0}, Le/h/b/a/n/a;-><init>(Le/h/b/a/n/g;)V

    const v0, 0x7f0e0064

    .line 4
    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public synthetic a(Landroid/content/DialogInterface;)V
    .locals 0

    .line 7
    invoke-virtual {p0}, Le/h/b/a/n/g;->a()V

    return-void
.end method

.method public synthetic a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 8
    invoke-virtual {p0}, Le/h/b/a/n/g;->a()V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "packid.ScreenUnlockErr"

    const-string p2, "ScreenUnlockErrorReceiver received"

    .line 1
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Le/h/b/a/n/g;->a:Landroid/app/Activity;

    const p2, 0x7f0e0133

    invoke-virtual {p0, p1, p2}, Le/h/b/a/n/g;->a(Landroid/content/Context;I)V

    return-void
.end method
