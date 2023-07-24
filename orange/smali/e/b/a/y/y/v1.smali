.class public Le/b/a/y/y/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Le/b/a/y/y/v1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/v1<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/y/v1;

    invoke-direct {v0}, Le/b/a/y/y/v1;-><init>()V

    sput-object v0, Le/b/a/y/y/v1;->a:Le/b/a/y/y/v1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/b/a/y/y/v1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/y/y/v1<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/y/v1;->a:Le/b/a/y/y/v1;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "TModel;>;"
        }
    .end annotation

    .line 2
    new-instance p2, Le/b/a/y/y/v0;

    new-instance p3, Le/b/a/d0/d;

    invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Le/b/a/y/y/u1;

    invoke-direct {p4, p1}, Le/b/a/y/y/u1;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p2
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method
