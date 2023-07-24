.class public final Le/f/c/l/e/o/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/m3;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/h;

    invoke-direct {v0}, Le/f/c/l/e/o/h;-><init>()V

    sput-object v0, Le/f/c/l/e/o/h;->a:Le/f/c/l/e/o/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/m3;Le/f/c/n/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "generator"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->h()[B

    move-result-object v0

    const-string v1, "identifier"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->j()J

    move-result-wide v0

    const-string v2, "startedAt"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->c()Ljava/lang/Long;

    move-result-object v0

    const-string v1, "endedAt"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->l()Z

    move-result v0

    const-string v1, "crashed"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Z)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->a()Le/f/c/l/e/o/k2;

    move-result-object v0

    const-string v1, "app"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 8
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->k()Le/f/c/l/e/o/l3;

    move-result-object v0

    const-string v1, "user"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 9
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->i()Le/f/c/l/e/o/j3;

    move-result-object v0

    const-string v1, "os"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 10
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->b()Le/f/c/l/e/o/n2;

    move-result-object v0

    const-string v1, "device"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 11
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->d()Le/f/c/l/e/o/p3;

    move-result-object v0

    const-string v1, "events"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 12
    invoke-virtual {p1}, Le/f/c/l/e/o/m3;->f()I

    move-result p1

    const-string v0, "generatorType"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

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
    check-cast p1, Le/f/c/l/e/o/m3;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/h;->a(Le/f/c/l/e/o/m3;Le/f/c/n/d;)V

    return-void
.end method
