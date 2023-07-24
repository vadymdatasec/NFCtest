.class public Li/h/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final b:Li/h/c/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li/h/c/a;

    invoke-direct {v0}, Li/h/c/a;-><init>()V

    sput-object v0, Li/h/c/a;->b:Li/h/c/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Li/h/c/a;
    .locals 1

    .line 1
    sget-object v0, Li/h/c/a;->b:Li/h/c/a;

    return-object v0
.end method
