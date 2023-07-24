.class public Lcom/orange/hce/proto/activity/LegalInformationActivity;
.super Lc/b/k/r;
.source "SourceFile"


# instance fields
.field public q:Ljava/lang/Integer;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->q:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public synthetic a(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->q:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->q:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x7

    if-lt p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->x()V

    :cond_0
    return-void
.end method

.method public synthetic b(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->x()V

    const/4 p1, 0x1

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0020

    .line 2
    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V

    const p1, 0x7f08004a

    .line 3
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->r:Landroid/widget/TextView;

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "packid.app.preferences"

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->s:Landroid/content/SharedPreferences;

    .line 5
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->w()V

    .line 6
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->v()V

    .line 7
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->u()V

    .line 8
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->s()V

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->q:Ljava/lang/Integer;

    return-void
.end method

.method public final s()V
    .locals 2

    const v0, 0x7f080190

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    .line 2
    new-instance v1, Le/h/b/a/l/x;

    invoke-direct {v1, p0}, Le/h/b/a/l/x;-><init>(Lcom/orange/hce/proto/activity/LegalInformationActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    new-instance v1, Le/h/b/a/l/w;

    invoke-direct {v1, p0}, Le/h/b/a/l/w;-><init>(Lcom/orange/hce/proto/activity/LegalInformationActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public final t()Ljava/lang/String;
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const v1, 0x7f0e002d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    .line 2
    invoke-virtual {p0, v1, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const v0, 0x7f0e002e

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->s:Landroid/content/SharedPreferences;

    const-string v1, "DEVELOPER_MODE"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LegalInformationActivity;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const v0, 0x7f0e002c

    goto :goto_0

    :cond_0
    const v0, 0x7f0e002b

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final v()V
    .locals 2

    const v0, 0x7f08004b

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final w()V
    .locals 2

    const v0, 0x7f08016b

    .line 1
    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/b/k/a;->d(Z)V

    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/orange/hce/proto/activity/LogActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
