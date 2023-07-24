.class public final Le/h/d/a/a/f;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

.field public final synthetic c:Le/h/d/a/a/h;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Lcom/orange/oab/contactless/packid/hce/user/User;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Le/h/d/a/a/h;Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 0

    iput-object p1, p0, Le/h/d/a/a/f;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    iput-object p2, p0, Le/h/d/a/a/f;->c:Le/h/d/a/a/h;

    iput-object p3, p0, Le/h/d/a/a/f;->d:Landroid/content/Context;

    iput-object p4, p0, Le/h/d/a/a/f;->e:Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Le/h/d/a/a/h;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/f;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    const-string v2, "perfom locking"

    invoke-static {v2, v1}, Li/h/c/k;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Le/h/d/a/a/f;->c:Le/h/d/a/a/h;

    iget-object v1, p0, Le/h/d/a/a/f;->d:Landroid/content/Context;

    iget-object v2, p0, Le/h/d/a/a/f;->e:Lcom/orange/oab/contactless/packid/hce/user/User;

    iget-object v3, p0, Le/h/d/a/a/f;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/h;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    return-void
.end method
