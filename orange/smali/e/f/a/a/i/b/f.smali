.class public final Le/f/a/a/i/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/a/a/i/b/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/a/a/i/b/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/i/b/f;

    invoke-direct {v0}, Le/f/a/a/i/b/f;-><init>()V

    sput-object v0, Le/f/a/a/i/b/f;->a:Le/f/a/a/i/b/f;

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
    check-cast p1, Le/f/a/a/i/b/f0;

    check-cast p2, Le/f/c/n/d;

    .line 2
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->b()J

    move-result-wide v0

    const-string v2, "eventTimeMs"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->a()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "eventCode"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->c()J

    move-result-wide v0

    const-string v2, "eventUptimeMs"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->e()[B

    move-result-object v0

    const-string v1, "sourceExtension"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sourceExtensionJsonProto3"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->g()J

    move-result-wide v0

    const-string v2, "timezoneOffsetSeconds"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 8
    invoke-virtual {p1}, Le/f/a/a/i/b/f0;->d()Le/f/a/a/i/b/m0;

    move-result-object p1

    const-string v0, "networkConnectionInfo"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    return-void
.end method
