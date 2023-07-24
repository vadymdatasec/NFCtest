.class public final Le/f/c/l/e/o/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/c/l/e/o/t2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/c/l/e/o/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/l/e/o/l;

    invoke-direct {v0}, Le/f/c/l/e/o/l;-><init>()V

    sput-object v0, Le/f/c/l/e/o/l;->a:Le/f/c/l/e/o/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/t2;Le/f/c/n/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "reason"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 4
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->b()Le/f/c/l/e/o/p3;

    move-result-object v0

    const-string v1, "frames"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 5
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->a()Le/f/c/l/e/o/t2;

    move-result-object v0

    const-string v1, "causedBy"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 6
    invoke-virtual {p1}, Le/f/c/l/e/o/t2;->c()I

    move-result p1

    const-string v0, "overflowCount"

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
    check-cast p1, Le/f/c/l/e/o/t2;

    check-cast p2, Le/f/c/n/d;

    invoke-virtual {p0, p1, p2}, Le/f/c/l/e/o/l;->a(Le/f/c/l/e/o/t2;Le/f/c/n/d;)V

    return-void
.end method
