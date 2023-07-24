.class public final Le/f/a/a/i/b/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/c/n/c<",
        "Le/f/a/a/i/b/m0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/a/a/i/b/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/i/b/h;

    invoke-direct {v0}, Le/f/a/a/i/b/h;-><init>()V

    sput-object v0, Le/f/a/a/i/b/h;->a:Le/f/a/a/i/b/h;

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
    check-cast p1, Le/f/a/a/i/b/m0;

    check-cast p2, Le/f/c/n/d;

    .line 2
    invoke-virtual {p1}, Le/f/a/a/i/b/m0;->b()Le/f/a/a/i/b/l0;

    move-result-object v0

    const-string v1, "networkType"

    invoke-interface {p2, v1, v0}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    .line 3
    invoke-virtual {p1}, Le/f/a/a/i/b/m0;->a()Le/f/a/a/i/b/k0;

    move-result-object p1

    const-string v0, "mobileSubtype"

    invoke-interface {p2, v0, p1}, Le/f/c/n/d;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/c/n/d;

    return-void
.end method
