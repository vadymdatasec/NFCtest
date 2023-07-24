.class public Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-static {p2, p3}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;->a(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p3

    const/4 v2, 0x0

    aput-object p3, v1, v2

    invoke-virtual {v0, p4, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 4
    invoke-static {p1, p3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    sget v0, Le/h/d/a/a/c;->added:I

    const-string v1, "addedBadges"

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V

    .line 2
    sget v0, Le/h/d/a/a/c;->suppressed:I

    const-string v1, "removedBadges"

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V

    return-void
.end method
