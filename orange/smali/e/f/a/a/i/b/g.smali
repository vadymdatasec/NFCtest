.class public final Le/f/a/a/i/b/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/a/a/i/b/h0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/a/a/i/b/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/i/b/g;

    invoke-direct {v0}, Le/f/a/a/i/b/g;-><init>()V

    sput-object v0, Le/f/a/a/i/b/g;->a:Le/f/a/a/i/b/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Le/f/a/a/i/b/h0;

    check-cast p2, Le/f/c/n/d;

    .line 2
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->f()J

    move-result-wide v0

    const-string v2, "requestTimeMs"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->g()J

    move-result-wide v0

    const-string v2, "requestUptimeMs"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->a()Le/f/a/a/i/b/d0;

    move-result-object v0

    const-string v1, "clientInfo"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->c()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "logSource"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "logSourceName"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->b()Ljava/util/List;

    move-result-object v0

    const-string v1, "logEvent"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 8
    invoke-virtual {p1}, Le/f/a/a/i/b/h0;->e()Le/f/a/a/i/b/n0;

    move-result-object p1

    const-string v0, "qosTier"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    return-void
.end method
