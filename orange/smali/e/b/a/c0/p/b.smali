.class public Le/b/a/c0/p/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/c0/p/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/c0/p/d<",
        "TR;>;"
    }
.end annotation


# static fields
.field public static final a:Le/b/a/c0/p/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/p/b<",
            "*>;"
        }
    .end annotation
.end field

.field public static final b:Le/b/a/c0/p/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/c0/p/e<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/c0/p/b;

    invoke-direct {v0}, Le/b/a/c0/p/b;-><init>()V

    sput-object v0, Le/b/a/c0/p/b;->a:Le/b/a/c0/p/b;

    .line 2
    new-instance v0, Le/b/a/c0/p/a;

    invoke-direct {v0}, Le/b/a/c0/p/a;-><init>()V

    sput-object v0, Le/b/a/c0/p/b;->b:Le/b/a/c0/p/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/b/a/c0/p/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/c0/p/e<",
            "TR;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/c0/p/b;->b:Le/b/a/c0/p/e;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Le/b/a/c0/p/c;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
