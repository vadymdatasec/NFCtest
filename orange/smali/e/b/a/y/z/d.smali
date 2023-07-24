.class public final Le/b/a/y/z/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/v<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final b:Le/b/a/y/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/v<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/z/d;

    invoke-direct {v0}, Le/b/a/y/z/d;-><init>()V

    sput-object v0, Le/b/a/y/z/d;->b:Le/b/a/y/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/b/a/y/z/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/y/z/d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/z/d;->b:Le/b/a/y/v;

    check-cast v0, Le/b/a/y/z/d;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Le/b/a/y/x/y0;II)Le/b/a/y/x/y0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/y/x/y0<",
            "TT;>;II)",
            "Le/b/a/y/x/y0<",
            "TT;>;"
        }
    .end annotation

    return-object p2
.end method

.method public a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method
