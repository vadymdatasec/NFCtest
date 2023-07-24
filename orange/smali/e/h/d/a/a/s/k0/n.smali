.class public Le/h/d/a/a/s/k0/n;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/n;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/k0/n;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/n;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/h/d/a/a/s/k0/n;->a:Ljava/lang/String;

    const-string v1, "unlockableByZoneID"

    invoke-virtual {p0, v1, v0}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Le/h/d/a/a/s/k0/n;->b:Ljava/lang/String;

    const-string v2, "userId"

    invoke-virtual {p0, v2, v1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Le/h/d/a/a/s/k0/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    iget-object v3, p0, Le/h/d/a/a/s/k0/n;->a:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v3, p0, Le/h/d/a/a/s/k0/n;->b:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Le/h/d/a/a/s/k0/m;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
