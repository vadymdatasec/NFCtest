.class public final synthetic Le/f/c/n/h/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/e;


# static fields
.field public static final a:Le/f/c/n/h/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/n/h/b;

    invoke-direct {v0}, Le/f/c/n/h/b;-><init>()V

    sput-object v0, Le/f/c/n/h/b;->a:Le/f/c/n/h/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/c/n/e;
    .locals 1

    sget-object v0, Le/f/c/n/h/b;->a:Le/f/c/n/h/b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Le/f/c/n/f;

    invoke-static {p1, p2}, Le/f/c/n/h/f;->a(Ljava/lang/String;Le/f/c/n/f;)V

    return-void
.end method
