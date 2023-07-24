.class public final Le/f/a/a/i/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/a/a/i/b/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/a/a/i/b/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/i/b/c;

    invoke-direct {v0}, Le/f/a/a/i/b/c;-><init>()V

    sput-object v0, Le/f/a/a/i/b/c;->a:Le/f/a/a/i/b/c;

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
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Le/f/a/a/i/b/b;

    check-cast p2, Le/f/c/n/d;

    .line 2
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->h()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "sdkVersion"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "model"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hardware"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "product"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "osBuild"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 8
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "manufacturer"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 9
    invoke-virtual {p1}, Le/f/a/a/i/b/b;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "fingerprint"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    return-void
.end method
