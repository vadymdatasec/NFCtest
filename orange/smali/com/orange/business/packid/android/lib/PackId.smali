.class public Lcom/orange/business/packid/android/lib/PackId;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PACKID_SCHEME:Ljava/lang/String; = "packid"

.field public static b:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/orange/business/packid/android/lib/PackId;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "packid"

    const-string v1, "Instantiate PackId"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iput-object p1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 2

    .line 8
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedSchemeSpecificPart()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedOpaquePart(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedFragment()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedFragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "packid"

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "http"

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "https"

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/n/s;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->clear()V

    .line 3
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Le/h/d/a/a/r/a;->b()V

    const-string v0, "packid"

    const-string v1, "Key guard not secured send broadcast com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final a(Landroid/content/Intent;)V
    .locals 2

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method

.method public activatePersistentLogs(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->startPersistentLog(Landroid/content/Context;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->stopPersistentLogs(Landroid/content/Context;)V

    :goto_0
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    sget-object v0, Le/h/d/a/a/r/b;->l:Le/h/d/a/a/r/b;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V

    .line 2
    sget-object v0, Le/h/d/a/a/r/b;->j:Le/h/d/a/a/r/b;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V

    .line 3
    sget-object v0, Le/h/d/a/a/r/b;->i:Le/h/d/a/a/r/b;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V

    .line 4
    sget-object v0, Le/h/d/a/a/r/b;->k:Le/h/d/a/a/r/b;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V

    .line 5
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    new-instance v1, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;

    invoke-direct {v1}, Lcom/orange/oab/contactless/packid/intent/ContactlessTransactionReceiver;-><init>()V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    new-instance v1, Le/h/d/a/a/r/c;

    invoke-direct {v1}, Le/h/d/a/a/r/c;-><init>()V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public clear()V
    .locals 2

    const-string v0, "packid"

    const-string v1, "clear called"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/n/u;->a(Landroid/content/Context;)V

    return-void
.end method

.method public createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 6

    const-string v0, "packid"

    const-string v1, "createDefaultUser called"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 3
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->defaultUser(Landroid/content/Context;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v1

    .line 4
    iget-object v3, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v3}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v3

    invoke-virtual {v3, v1}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;)Le/h/d/a/a/p/a/a/a;

    move-result-object v3

    .line 5
    iget-object v4, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v4}, Lcom/orange/oab/contactless/packid/service/Aid;->register(Landroid/content/Context;)V

    .line 6
    new-instance v4, Le/h/d/a/a/r/a;

    iget-object v5, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-direct {v4, v5}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v3}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    const-string v3, "Can\'t create default User: "

    .line 7
    invoke-static {v0, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le/h/a/a/a/a/b;->a(Landroid/content/Context;Z)V

    const-string v0, "packid"

    const-string v1, "Starting service Pack ID"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const-class v2, Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v1}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v1

    new-instance v2, Le/h/d/a/a/r/d;

    invoke-direct {v2}, Le/h/d/a/a/r/d;-><init>()V

    invoke-virtual {v1, v2, v0}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v1}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v1

    new-instance v2, Le/h/d/a/a/r/e;

    invoke-direct {v2}, Le/h/d/a/a/r/e;-><init>()V

    invoke-virtual {v1, v2, v0}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public findTransactionsByZoneId(Lfr/mbs/binary/Octets;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr/mbs/binary/Octets;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/domain/Transaction;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "findTransactionsByZoneId for zone "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " called"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->b(Landroid/content/Context;)Le/h/d/a/a/s/c0;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, p1, v1}, Le/h/d/a/a/s/c0;->a(Lfr/mbs/binary/Octets;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public forceLevelUpdateForBadge(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 2

    .line 1
    sget-object v0, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/h/d/a/a/v/b;

    invoke-virtual {v0, p2, p1}, Le/h/d/a/a/v/b;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object p1

    return-object p1
.end method

.method public forceRssiSignalEventsUpdate()V
    .locals 2

    .line 1
    sget-object v0, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/h/d/a/a/v/b;

    invoke-virtual {v0}, Le/h/d/a/a/v/b;->b()V

    .line 2
    sget-object v0, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/h/d/a/a/v/b;

    invoke-virtual {v0}, Le/h/d/a/a/v/b;->a()V

    return-void
.end method

.method public forceStatusUpdateForBadge(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)Z
    .locals 2

    .line 1
    sget-object v0, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/h/d/a/a/v/b;

    invoke-virtual {v0, p2, p1}, Le/h/d/a/a/v/b;->b(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p1

    return p1
.end method

.method public getContactlessIds()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "packid"

    const-string v1, "getContactlessIds called"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v1}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v1

    invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 4
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/service/NoUserException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getUserByContactlessId for contactlessId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " called"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/service/NoUserException;

    invoke-direct {p1}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V

    throw p1
.end method

.method public getUsers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation

    const-string v0, "packid"

    const-string v1, "getUsers called"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hasBleBadges()Z
    .locals 3

    const-string v0, "packid"

    const-string v1, "hasBleBadges called"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 4
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 5
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public isPersistentLogsActive()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/a/a/a/a/b;->c(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public register(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;Ljava/lang/String;)V

    return-void
.end method

.method public register(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 3

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "register called with uri "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v0, v2}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Can\'t register while configuration is not initialized"

    .line 4
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 5
    :cond_0
    new-instance v0, Le/h/d/a/a/n/p;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/n/p;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Le/h/d/a/a/n/p;->b(Landroid/net/Uri;Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "User public reference URI is required when registering!"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public start()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->start(Z)V

    return-void
.end method

.method public start(Z)V
    .locals 1

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->start(ZLjava/util/Map;)V

    return-void
.end method

.method public start(ZLjava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/n/w/d;->a(Landroid/content/Context;)V

    .line 4
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/a/a/a/a/a;->a(Landroid/content/Context;)Le/h/a/a/a/a/a;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Le/h/a/a/a/a/a;->a(Ljava/util/Map;)V

    .line 6
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->a()V

    const-string p2, "packid"

    const-string v0, "start called"

    .line 7
    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    sget-object v0, Lcom/orange/business/packid/android/lib/PackId;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Pack ID service should be started only once by application lifecycle"

    .line 9
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    sget v1, Le/h/d/a/a/d;->network_security_config:I

    invoke-static {v0, v1}, Le/d/a/a/b;->a(Landroid/content/Context;I)Le/d/a/a/b;

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Starting Pack ID service (useUiNotificationsOnContactlessTransaction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    .line 12
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->b()V

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->c()V

    .line 14
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->e()V

    .line 15
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->f()V

    .line 16
    invoke-virtual {p0}, Lcom/orange/business/packid/android/lib/PackId;->d()V

    return-void
.end method

.method public startBle()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le/h/a/a/a/a/b;->a(Landroid/content/Context;Z)V

    .line 2
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const-class v2, Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startBleTransaction called for contactlessId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " and zone "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/orange/business/packid/android/lib/PackId;->getUserByContactlessId(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isBle()Z

    move-result v2
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, " on contactless id "

    if-eqz v2, :cond_0

    .line 5
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start BLE transaction for badge "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const-class v3, Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "contactlessId"

    .line 7
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "zoneId"

    .line 8
    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 9
    invoke-virtual {p0, v0}, Lcom/orange/business/packid/android/lib/PackId;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 10
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Trying to start BLE transaction on not BLE badge "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Lcom/orange/oab/contactless/packid/service/NoUserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 11
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to start ble transaction on unknown zone id "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for contactless id "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 12
    :catch_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Trying to start ble transaction on unknown contactless id "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public startBroadcastRSSI()V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiBroadcast(Z)V

    return-void
.end method

.method public startBroadcastRSSILevel()V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiLevelBroadcast(Z)V

    return-void
.end method

.method public startPersistentLogs(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->startPersistentLogs(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public startPersistentLogs(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->startPersistentLog(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method

.method public stopBle()V
    .locals 4

    const-string v0, "packid"

    const-string v1, "Stopping service Pack ID BLE"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Le/h/a/a/a/a/b;->a(Landroid/content/Context;Z)V

    .line 3
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    const-class v3, Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    return-void
.end method

.method public stopBroadcastRSSI()V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiBroadcast(Z)V

    return-void
.end method

.method public stopBroadcastRSSILevel()V
    .locals 2

    .line 1
    sget-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->setEnableRssiLevelBroadcast(Z)V

    return-void
.end method

.method public stopPersistentLogs(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/LogManager;->stopPersistentLogs(Landroid/content/Context;)V

    return-void
.end method

.method public update()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V

    return-void
.end method

.method public update(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->update(ZLjava/lang/String;)V

    return-void
.end method

.method public update(ZLjava/lang/String;)V
    .locals 2

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update called with"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    const-string v1, "out"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " alert on errors"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Le/h/d/a/a/r/a;->a(ZZLjava/lang/String;)V

    return-void
.end method

.method public writeToLogs(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/orange/business/packid/android/lib/PackId;->writeToLogs(Ljava/lang/String;Z)V

    return-void
.end method

.method public writeToLogs(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/business/packid/android/lib/PackId;->a:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method
