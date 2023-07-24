.class public final Le/f/c/l/e/o/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/o3;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/b;

    invoke-direct {v0}, Le/f/c/l/e/o/b;-><init>()V

    sput-object v0, Le/f/c/l/e/o/b;->a:Le/f/c/l/e/o/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/o3;Le/f/c/n/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdkVersion"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gmpAppId"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->f()I

    move-result v0

    const-string v1, "platform"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "installationUuid"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "buildVersion"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "displayVersion"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;

    move-result-object v0

    const-string v1, "session"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/o3;->e()Le/f/c/l/e/o/h2;

    move-result-object p1

    const-string v0, "ndkPayload"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Le/f/c/l/e/o/o3;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/b;->a(Le/f/c/l/e/o/o3;Le/f/c/n/d;)V

    return-void
.end method
