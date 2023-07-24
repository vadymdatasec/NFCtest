.class public final Le/f/c/l/e/o/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/e3;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/p;

    invoke-direct {v0}, Le/f/c/l/e/o/p;-><init>()V

    sput-object v0, Le/f/c/l/e/o/p;->a:Le/f/c/l/e/o/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/e3;Le/f/c/n/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/e3;->a()Ljava/lang/Double;

    move-result-object v0

    const-string v1, "batteryLevel"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/e3;->b()I

    move-result v0

    const-string v1, "batteryVelocity"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/e3;->f()Z

    move-result v0

    const-string v1, "proximityOn"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Z)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/e3;->d()I

    move-result v0

    const-string v1, "orientation"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;I)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/e3;->e()J

    move-result-wide v0

    const-string v2, "ramUsed"

    invoke-interface {p2, v2, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

    .line 7
    invoke-virtual {p1}, Le/f/c/l/e/o/e3;->c()J

    move-result-wide v0

    const-string p1, "diskUsed"

    invoke-interface {p2, p1, v0, v1}, Le/f/c/n/d;->a(Ljava/lang/String;J)Le/f/c/n/d;

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
    check-cast p1, Le/f/c/l/e/o/e3;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/p;->a(Le/f/c/l/e/o/e3;Le/f/c/n/d;)V

    return-void
.end method
