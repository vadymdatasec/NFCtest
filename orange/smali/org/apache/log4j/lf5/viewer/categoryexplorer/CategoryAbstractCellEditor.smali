.class public Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/swing/table/TableCellEditor;
.implements Ljavax/swing/tree/TreeCellEditor;


# static fields
.field public static synthetic e:Ljava/lang/Class;


# instance fields
.field public a:Ljavax/swing/event/EventListenerList;

.field public b:Ljava/lang/Object;

.field public c:Ljavax/swing/event/ChangeEvent;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljavax/swing/event/EventListenerList;

    invoke-direct {v0}, Ljavax/swing/event/EventListenerList;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a:Ljavax/swing/event/EventListenerList;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a:Ljavax/swing/event/EventListenerList;

    invoke-virtual {v0}, Ljavax/swing/event/EventListenerList;->getListenerList()[Ljava/lang/Object;

    move-result-object v0

    .line 3
    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    :goto_0
    if-ltz v1, :cond_3

    .line 4
    aget-object v2, v0, v1

    sget-object v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    if-nez v3, :cond_0

    const-string v3, "javax.swing.event.CellEditorListener"

    invoke-static {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    :cond_0
    if-ne v2, v3, :cond_2

    .line 5
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    if-nez v2, :cond_1

    .line 6
    new-instance v2, Ljavax/swing/event/ChangeEvent;

    invoke-direct {v2, p0}, Ljavax/swing/event/ChangeEvent;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 7
    aget-object v2, v0, v2

    check-cast v2, Ljavax/swing/event/CellEditorListener;

    iget-object v3, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    invoke-interface {v2, v3}, Ljavax/swing/event/CellEditorListener;->editingCanceled(Ljavax/swing/event/ChangeEvent;)V

    :cond_2
    add-int/lit8 v1, v1, -0x2

    goto :goto_0

    :cond_3
    return-void
.end method

.method public addCellEditorListener(Ljavax/swing/event/CellEditorListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a:Ljavax/swing/event/EventListenerList;

    sget-object v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    if-nez v1, :cond_0

    const-string v1, "javax.swing.event.CellEditorListener"

    invoke-static {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0, v1, p1}, Ljavax/swing/event/EventListenerList;->add(Ljava/lang/Class;Ljava/util/EventListener;)V

    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a:Ljavax/swing/event/EventListenerList;

    invoke-virtual {v0}, Ljavax/swing/event/EventListenerList;->getListenerList()[Ljava/lang/Object;

    move-result-object v0

    .line 2
    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    :goto_0
    if-ltz v1, :cond_3

    .line 3
    aget-object v2, v0, v1

    sget-object v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    if-nez v3, :cond_0

    const-string v3, "javax.swing.event.CellEditorListener"

    invoke-static {v3}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    :cond_0
    if-ne v2, v3, :cond_2

    .line 4
    iget-object v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    if-nez v2, :cond_1

    .line 5
    new-instance v2, Ljavax/swing/event/ChangeEvent;

    invoke-direct {v2, p0}, Ljavax/swing/event/ChangeEvent;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 6
    aget-object v2, v0, v2

    check-cast v2, Ljavax/swing/event/CellEditorListener;

    iget-object v3, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->c:Ljavax/swing/event/ChangeEvent;

    invoke-interface {v2, v3}, Ljavax/swing/event/CellEditorListener;->editingStopped(Ljavax/swing/event/ChangeEvent;)V

    :cond_2
    add-int/lit8 v1, v1, -0x2

    goto :goto_0

    :cond_3
    return-void
.end method

.method public cancelCellEditing()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a()V

    return-void
.end method

.method public getCellEditorValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public getClickCountToStart()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I

    return v0
.end method

.method public getTableCellEditorComponent(Ljavax/swing/JTable;Ljava/lang/Object;ZII)Ljava/awt/Component;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getTreeCellEditorComponent(Ljavax/swing/JTree;Ljava/lang/Object;ZZZI)Ljava/awt/Component;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isCellEditable(Ljava/util/EventObject;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/awt/event/MouseEvent;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Ljava/awt/event/MouseEvent;

    invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getClickCount()I

    move-result p1

    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public removeCellEditorListener(Ljavax/swing/event/CellEditorListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a:Ljavax/swing/event/EventListenerList;

    sget-object v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    if-nez v1, :cond_0

    const-string v1, "javax.swing.event.CellEditorListener"

    invoke-static {v1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->e:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0, v1, p1}, Ljavax/swing/event/EventListenerList;->remove(Ljava/lang/Class;Ljava/util/EventListener;)V

    return-void
.end method

.method public setCellEditorValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->b:Ljava/lang/Object;

    return-void
.end method

.method public setClickCountToStart(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I

    return-void
.end method

.method public shouldSelectCell(Ljava/util/EventObject;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->isCellEditable(Ljava/util/EventObject;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    check-cast p1, Ljava/awt/event/MouseEvent;

    invoke-virtual {p1}, Ljava/awt/event/MouseEvent;->getClickCount()I

    move-result p1

    iget v0, p0, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->d:I

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public stopCellEditing()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/categoryexplorer/CategoryAbstractCellEditor;->b()V

    const/4 v0, 0x1

    return v0
.end method
